public class one_two_one {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        maxProfit(nums);
    }

    //dp[n]表示倒数n天买的话，能收获的最大值
    //dp[n]=Max(dp[n-1],Max-prices[length-n])
    public static int maxProfit(int[] prices) {
        int length=prices.length;
        int[] dp = new int[length];
        dp[0]=0;
        int Max=prices[length-1];
        for (int i = 1; i < length; i++) {
            //求dp[i]
            //
            int count = Max-prices[length-i-1];
            dp[i]=Math.max(count,dp[i-1]);
            Max=Math.max(Max,prices[length-i-1]);
        }

        return dp[length-1];
    }
}
