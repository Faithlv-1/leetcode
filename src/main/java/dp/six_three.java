package dp;

public class six_three {
    public static void main(String[] args) {

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                //一行一个
                if(i==0&&j==0){
                    dp[i][j]=0;
                }
                //第一行
                else if(i==0){
                    //判断前面是否为阻挡
                    if(obstacleGrid[i][j-1]!=1){
                        dp[i][j] = dp[i][j-1];
                    }
                }
                //第一列
                else if(j==0){
                    //判断上面是否为阻挡
                    if(obstacleGrid[i-1][j]!=1){
                        dp[i][j] = dp[i-1][j];
                    }
                }

                //其他
                else{
                    int shang = obstacleGrid[i-1][j]==1?0:dp[i-1][j];
                    int zuo = obstacleGrid[i][j-1]==1?0:dp[i][j-1];
                    dp[i][j] = shang+zuo;
                }
            }
        }

        return dp[row][col];
    }
}
