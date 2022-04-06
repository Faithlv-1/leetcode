package dp;

import java.util.ArrayList;
import java.util.List;

public class one_two_zero {
    public static void main(String[] args) {
        ArrayList<List<Integer>> lsAll = new ArrayList<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(-1);
        lsAll.add(ls1);
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(2);
        ls2.add(3);
        lsAll.add(ls2);
        ArrayList<Integer> ls3 = new ArrayList<>();
        ls3.add(1);
        ls3.add(-1);
        ls3.add(-1);
        lsAll.add(ls3);
        minimumTotal(lsAll);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        //特殊情况
        if(triangle==null)
            return 0;

        //dp[i-1][j-1]定义为到i行j位最小路径和
        //dp[i][j] = min(dp[i-1][j-1],dp[i-1][j])
        int row = triangle.size();
        int col = triangle.get(row-1).size();
        int[][] dp = new int[row+1][col+1];
        dp[0][0] = 0;
        //将dp[row-1][col]全部填
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                //若为最左边界
                if(j==0){
                    dp[i][j] = dp[i-1][j] + triangle.get(i-1).get(j);
                }
                //若为最右
                else if(j==i){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i-1).get(j-1);
                }
                //若不为最边界
                else{
                    int one = dp[i-1][j] + triangle.get(i-1).get(j);
                    int two = dp[i-1][j-1] +triangle.get(i-1).get(j-1);
                    dp[i][j] = Math.min(one,two);
                }
            }
        }

        //给第row行赋值，并选最小值
        int min=Integer.MAX_VALUE;
        for(int i=0;i<row+1;i++){
            if (i==0){
                dp[row][i] = dp[row-1][i]+triangle.get(row-1).get(i);
                min = Math.min(dp[row][i],min);
            }
            else if(i==row){
                dp[row][i] = dp[row-1][i-1]+triangle.get(row-1).get(i-1);
                min = Math.min(dp[row][i],min);
            }
            else
            {
                int one = dp[row-1][i] + triangle.get(row-1).get(i);
                int two = dp[row-1][i-1] +triangle.get(row-1).get(i-1);
                dp[row][i] = Math.min(one,two);
                min=Math.min(dp[row][i],min);
            }
        }

        return min;

    }
}

