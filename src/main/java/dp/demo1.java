package dp;

import java.util.ArrayList;
import java.util.List;

//问题描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
//        求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class demo1 {
    public static void main(String[] args) {
        int[] dp=new int[5];
        way(4,dp);
    }
    public static int[] way(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <n+1 ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        return dp;
    }
}
