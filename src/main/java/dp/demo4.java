package dp;

public class demo4 {
    public static void main(String[] args) {
        System.out.println(moneyCount(11));
    }
    public static int moneyCount(int money){
        //1,5,11元
        //
        int[] dp=new int[money+1];
        dp[0]=0;
        //计算dp[i]
        for(int i=1;i<money+1;i++){
            //从dp[i-1],dp[i-5],dp[i-11]中选出最小值
            //i>=11
            if(i>=11){
                dp[i]=Math.min(dp[i-1],Math.min(dp[i-5],dp[i-11]))+1;
            }
            //5<=i<11
            else if(i<11&&i>=5){
                dp[i]=Math.min(dp[i-1],dp[i-5])+1;
            }
            //1<=i<5
            else {
                dp[i]=dp[i-1]+1;
            }
        }
        return dp[money];
        }
}
