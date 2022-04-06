package dp;

public class LSC {
    public static void main(String[] args) {
        DP("abcdefg","xyzabcd");
    }

//    //最长公共子序列
//    //1.dp[i][j],s1长度i,s2长度j时，对应最长子序列
//    //2.if s1[i]==s2[j] dp[i][j]=dp[i-1][j-1]+1
//    //if s1[i]!=s2[j] dp[i][j] = max(dp[i][j-1],dp[i-1][j])
//    //依赖左上
//    public static void DP(String s1,String s2){
//        String res="";
//        String[][] s3 = new String[s1.length()+1][s2.length()+1];
//        for (int i = 0; i <s3.length ; i++) {
//            for (int j = 0; j < s3.length; j++) {
//                s3[i][j] = "";
//            }
//        }
//        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
//        for(int i=1;i<s1.length()+1;i++){
//            for (int j = 1; j < s2.length()+1; j++) {
//                if(s1.charAt(i-1)==s2.charAt(j-1)){
//                    dp[i][j]=dp[i-1][j-1]+1;
//                    s3[i][j]=s3[i-1][j-1]+s1.charAt(i-1);
//                }
//                else{
//                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
//                    s3[i][j] =dp[i][j-1]>dp[i-1][j]?s3[i][j-1]:s3[i-1][j];
//                }
//            }
//        }
//        return;
//    }

    //最长公共字串
    //1.
    public static void DP(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        int max=0;
        //s1长度为
        for (int i = 1; i < len1+1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max= Math.max(dp[i][j], max);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return;
    }
}
