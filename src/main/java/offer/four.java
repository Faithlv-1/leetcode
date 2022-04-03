package offer;

import java.util.HashMap;
import java.util.Map;

public class four {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return 0;
    }
}
