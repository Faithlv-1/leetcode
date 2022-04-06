package dp;

public class one_two_one {
    public static void main(String[] args) {
              maxProfit(new int[]{7,1,5,3,6,4});
    }
    public static int maxProfit(int[] prices) {
        //dp[i]第i天买入的最大shouyi
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int max=0;
        int min = prices[0];
        for (int i = 1; i <prices.length ; i++) {
            int count = prices[i]-min;
            dp[i] = Math.max(dp[i-1],count);
            //更新最小
            min = Math.min(min,prices[i]);
        }

        return dp[prices.length-1];

    }

}
