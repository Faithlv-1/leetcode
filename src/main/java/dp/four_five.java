package dp;

public class four_five {
    public static void main(String[] args) {

    }

    public static int jump(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=0;
        int count=0;
        while(right<len-1){
            int max=0;
            //计算跳跃最远的地方
            for (int i = left; i <right+1 ; i++) {
                max=Math.max(max,i+nums[i]);
            }
            left=right+1;
            right=max;
            count++;
        }
        return count;
    }
}
