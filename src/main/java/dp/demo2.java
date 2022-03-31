package dp;

public class demo2 {
    public static void main(String[] args) {
        int[][] array={
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int dp[][]=new int[3][3];
        dp[0][0]=array[0][0];
        //横向赋值
        for (int i = 1; i <3 ; i++) {
            dp[0][i]=dp[0][i-1]+array[0][i];
        }
        //
        for (int i = 1; i <3 ; i++) {
            dp[i][0]=dp[i-1][0]+array[i][0];
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if(dp[i-1][j]<dp[i][j-1]){
                    dp[i][j]=array[i][j]+dp[i-1][j];
                }
                else
                    dp[i][j]=array[i][j]+dp[i][j-1];
            }
        }

        return;
    }
}
