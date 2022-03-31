package dp;

public class three_zero_zero {
    public static void main(String[] args) {
        int[] dp={2,45,123,35,234,53,45,2,4};
        System.out.println(lengthOfLIS(dp));
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums==null)
            return 0;
        int[] dp=new int[nums.length];
        dp[0]=1;
        //将dp[i]赋值，对应i位置最长子序列
        for(int i=1;i<dp.length;i++){
            //dp[i]的取值
            int dpi_max=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]&&dpi_max<(dp[j]+1))
                    dpi_max=dp[j]+1;
            }
            dp[i]=dpi_max;
        }

        //查找dp中最大值
        int dp_max=dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>dp_max){
                dp_max=dp[i];
            }
        }

        return dp_max;
    }
}
