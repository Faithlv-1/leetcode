import java.util.logging.Level;

public class one_three_six {
    public static void main(String[] args) {
        int[]nums ={1,5,5,2,2};
        int num = singleNumber(nums);
        System.out.println("sad");
    }
    public static int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        sort(nums);
        //判断只出现一次
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                if(nums[i]!=nums[i+1])
                    return nums[i];
            }
            else if(i==nums.length-1){
                if(nums[i]!=nums[i-1])
                    return nums[i];
            }
            else if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
                return nums[i];
        }
        return 0;
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
