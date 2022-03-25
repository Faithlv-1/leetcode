public class one_six_nine {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,2,2};
        majorityElement(nums);
    }

    //投票算法
    public static int majorityElement(int[] nums) {
        int temp=nums[0];
        int count=1;
        for (int i = 1; i <nums.length ; i++) {
            if(temp!=nums[i]){
                count--;
            }
            else {
                count++;
            }
            if(count==0){
                temp=nums[i];
                count++;
            }
        }

        if(count>0)
            return temp;
        else
            return 0;

    }
}
