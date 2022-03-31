import java.awt.font.NumericShaper;
import java.util.HashMap;

public class one_three {
    public static void main(String[] args) {
        romanToInt("LVIII");
    }
    
    public static int romanToInt(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);

        int count=0;
        int last=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            String key=s.charAt(i)+"";
            int now=hm.get(key);
            //正常
            if(now>=last){
                count+=now;
                last=now;
            }
            //非正常
            else {
                count-=now;
            }
        }

        return count;

    }
}
