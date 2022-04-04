import java.util.ArrayList;
import java.util.List;

public class one_three_nine {
    public static void main(String[] args) {
        String s="leetcode";
        List<String> wordlist = new ArrayList<>();
        wordlist.add("leet");
        wordlist.add("code");
        System.out.println(wordBreak(s,wordlist));
    }

//    public static boolean wordBreak(String s, List<String> wordDict) {
//        if(s.length()==0){
//            return true;
//        }
//        return wordBreak2(s,0,s.length()-1,wordDict);
//    }
//
//    //判断字符串s，left-right这段能否在wordDict拼出
//    public static boolean wordBreak2(String s, int left,int right,List<String> wordDict) {
//
//        //返回条件
//        if(left==right){
//            String find=s.substring(left,right+1);
//            if(wordDict.contains(find)){
//                return true;
//            }
//            else
//                return false;
//        }
//        else if(left>right)
//            return true;
//        //判断整个是否存在
//        else if(wordDict.contains(s.substring(left,right+1))){
//            return true;
//        }
//
//
//        //将i作为划分(左）
//        for(int i=left;i<right;i++){
//            boolean leftBool=false;
//            boolean rightBool=false;
//            leftBool=wordBreak2(s,left,i,wordDict);
//            if(!leftBool)
//                continue;
//            rightBool=wordBreak2(s,i+1,right,wordDict);
//            if(rightBool&&leftBool){
//                return true;
//            }
//
//        }
//
//        return false;
//    }
    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<s.length()+1;i++){
            for (int j = 0; j < i; j++) {
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

}
