public class two_seven {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(removeElement(nums,2));
    }
    public static int removeElement(int[] nums, int val) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[p]=nums[i];
                p++;
                continue;
            }
        }
        return p;
    }
}
