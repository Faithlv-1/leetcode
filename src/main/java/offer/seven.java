package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seven {
    public static void main(String[] args) {
        threeSum(new int[]{1,-1,-1,0});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lsAll = new ArrayList<>();
        Arrays.sort(nums);
        int first;
        int end;
        for(int i =0;i<nums.length-2;){
            int now = nums[i];
            first=i+1;
            end=nums.length-1;
            while (first<end){
               int firstNum=nums[first];
               int endNum=nums[end];
               if(firstNum+endNum+now==0){
                   List<Integer> ls = new ArrayList<>();
                   ls.add(now);
                   ls.add(firstNum);
                   ls.add(endNum);
                   lsAll.add(ls);

                   while (nums[first]==firstNum&&first<end)
                       first++;
                   while (nums[end]==endNum&&end>first)
                       end--;
               }
               else if(firstNum+endNum+now>0){
                   while (nums[end]==endNum&&end>first)
                       end--;
               }
               else if(firstNum+endNum+now<0){
                   while (nums[first]==firstNum&&first<end)
                       first++;
               }
            }
            //
            while(nums[i]==now&&i<nums.length-2){
                i++;
            }
        }
        return lsAll;
    }
}
