public class two_six {
    public static void main(String[] args) {
        int[] nums={1,2,2,2,2,3,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }
        else if(nums.length==1){
            return 1;
        }
        //pæé
        int p=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[p]){
                continue;
            }
            else{
                p++;
                nums[p]=nums[i];
            }

        }

        return (p+1);
    }
}
