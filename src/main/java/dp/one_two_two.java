package dp;

public class one_two_two {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];
        dp[0]=0;
        for (int i = 1; i < len; i++) {
            if(prices[i]>prices[i-1]){
                dp[i] = dp[i-1] + prices[i] - prices[i-1];
            }
            else
                dp[i] = dp[i-1];
        }

        return dp[len-1];
    }
}
