import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class one_five {
    public static void main(String[] args) {
        int[]nums={0,0,0};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();
        //长度小于3
        if(nums==null||nums.length<3)
            return ls;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ) {
            //
            if(nums[i]>0)
                break;
            int now=i;
            int p=now+1;
            int q=nums.length-1;
            while(p<q){
                if(nums[now]+nums[p]+nums[q]==0){
                    List<Integer> ls2 = new ArrayList<>();
                    ls2.add(nums[now]);
                    ls2.add(nums[p]);
                    ls2.add(nums[q]);
                    ls.add(ls2);
                    int p_num=nums[p];
                    int q_num=nums[q];
                    while(nums[p]==p_num&&p!=nums.length-1)
                        p++;
                    while (nums[q]==q_num&&q!=0)
                        q--;
                }

                else if(nums[now]+nums[p]+nums[q]>0){
                    q--;
                }

                else if(nums[now]+nums[p]+nums[q]<0){
                    p++;
                }
            }
            while(nums[now]==nums[i]&&i<nums.length-2)
                i++;
        }
        return ls;

    }
}
