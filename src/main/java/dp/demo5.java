package dp;

//中科考研
//回文串插入最少
//
public class demo5 {
    public static void main(String[] args) {
        System.out.println(dp("leetcode"));
    }
    public static int dp(String s) {
        //dp[i][j] 字符串i到j变成回文串需要插入的次数
        int[][] dp = new int[s.length()][s.length()];

        //从长度为2到n赋值
        for (int length = 1; length < s.length(); length++) {
            //此时字符串长度为i
            for (int i = 0; i < s.length() - length; i++) {
                int j = i + length;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                }

                //
                else {
                    dp[i][j] = Math.min(dp[i + 1][j - 1] + 2, Math.min(dp[i + 1][j] + 1, dp[i][j - 1] + 1));
                }
            }


        }
        return dp[0][dp.length - 1];


    }

    public char findTheDifference(String s, String t) {
        int count1 = 0;
        int count2 = 0;
        for(int i =0;i<s.length();i++){
            count1+=s.charAt(i);
        }
        for(int i =0;i<t.length();i++){
            count2+=t.charAt(i);
        }

        return (char)(count2-count1);


    }

//    public int smallestEqual(int[] nums) {
//        for(int i = 0;i<nums.length;i++){
//            if(i%10==nums[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
}
