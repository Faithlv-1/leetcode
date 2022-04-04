package sort;

public class xuanzhe {
    public static void main(String[] args) {
        int[] nums={66,423,51,34,35,2,35,2,53};
        sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }

    //选择排序
    public static void sort(int[] nums){
        //排序次数n-1次
        //比较次数n-i-1次数

        for (int i = 0; i < nums.length-1; i++) {
            int max=nums[0];
            int p=0;
            for(int j=1;j<nums.length-i;j++){
                if(max<nums[j]){
                    max=nums[j];
                    p=j;
                }
            }
            //交换最大值与最后位置
            nums[p]=nums[nums.length-1-i];
            nums[nums.length-1-i] = max;

        }

    }
}
