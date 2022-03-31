package sort;

public class select_sort {
    public static void main(String[] args) {
        int[] nums={2,345,24,24,34,45};
        sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int max=nums[0];
            int p=0;
            for(int j=1;j<nums.length-i;j++){
                if(max<nums[j]){
                    max=nums[j];
                    p=j;
                }
            }
            nums[p]=nums[nums.length-i-1];
            nums[nums.length-i-1]=max;
        }
    }
}
