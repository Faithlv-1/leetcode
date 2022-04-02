public class nine_six {
    public static void main(String[] args) {
        numTrees(3);
    }
//    public static int numTrees(int n) {
//       return numTress2(1,n);
//    }
//
//    //左边界，右边界，选出中间值，返回值为
//    public static int numTress2(int left,int right){
//        //返回情况
//        if(left>=right){
//            return 1;
//        }
//
//        int all_count=0;
//        //选择left-right作为中间节点
//        for (int i=left;i<=right;i++){
//            //i为中间节点
//            int left_count=0;
//            int right_count=0;
//            left_count+=numTress2(left,i-1);
//            right_count+=numTress2(i+1,right);
//            all_count+=left_count*right_count;
//        }
//        return all_count;
//    }
    public static int numTrees(int n) {
        int[] dp =new int[n+1];
        dp[0]=dp[1]=1;
        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    //dp[n]表示n个节点可以组成的二叉搜索树的数量
    //dp[n]=dp[0]*dp[n-1](抽取1作为头节点，为空，右为n-1长度)+dp[1]*dp[n-2](抽取2作为头节点，为空，右为n-2长度)+.....dp[n-1]*dp[1];
    //dp[n]=dp[i]*dp[n-i-1],i从0到n-1，i可以理解为选择节点后，放在该节点左边节点的个数
    //dp[0]=1;
    //dp[1]=1;
    public static void numTrees2(int left,int right,int[] dp) {
        for(int i=left;i<=right;i++){

        }


    }
}
