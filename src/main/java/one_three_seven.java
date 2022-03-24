public class one_three_seven {
    public static void main(String[] args) {
        int[]nums ={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        sort(nums);
        int i=0;
        for (i = 0; i < nums.length-2; ) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            else
                i=i+3;
        }

        return nums[i];
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
