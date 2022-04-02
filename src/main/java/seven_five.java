public class seven_five {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int first=0;
        int end=nums.length-1;
        for (int i = 0; i < nums.length&&i<=end;i++) {
            if(nums[i]==0){
                //换到0的指针位置
                nums[i]= nums[first];
                nums[first]=0;
                first++;
            }
            else if(nums[i]==2){
                //换到2的指针处
                nums[i]=nums[end];
                nums[end]=2;
                end--;
                i--;
            }
        }


    }
}
