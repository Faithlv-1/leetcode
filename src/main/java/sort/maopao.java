package sort;

public class maopao {
    public static void main(String[] args) {
        int[] nums={66,423,51,34,35,2,35,2,53};
        sort(nums);
        for(int i:nums){
            System.out.println(i);
        }

    }

    public static int[] sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
