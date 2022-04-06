package dp;

import java.lang.annotation.ElementType;

public class nine_one {
    public static void main(String[] args) {
        numDecodings("1123");
    }
    public static int numDecodings(String s) {
        //dp[i]表示前i个数字能映射的种数
        //flag表示前面的数字是否有联合映射
        // dp[0]=0
        //flag=true

        int len = s.length();
        if(len==0)
            return 0;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        if(s.charAt(0)=='0')
            return 0;
        else
            dp[1] = 1;
        for (int i = 2; i < len + 1; i++) {
            if(s.charAt(i-1)=='0'){
                //判断是否能和前面进联合
                //若不能，则放回0
                //若能，则判断前面是否已经进行，若已经，则dp[i] = dp[i-1]-1;
                //若没有，则dp[i] = dp[i-1];
                if((s.charAt(i-2)!='1'&&s.charAt(i-2)!='2'))
                    return 0;
                else{
                    dp[i] = dp[i-2];
                    continue;
                }
            }

            //判断是否能和前面进行联合映射
            int last = (s.charAt(i-1)-'0');
            int front = (s.charAt(i-2)-'0')*10;
            if(last+front>=10&&last+front<=26){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else
                dp[i] = dp[i-1];

        }

        return dp[len];
    }
}
