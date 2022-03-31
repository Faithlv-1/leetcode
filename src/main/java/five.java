public class five {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aasdasdab"));
    }
    public static String longestPalindrome(String s) {
//        String s2=new StringBuffer(s).reverse().toString();
//        int p=0;
//        int max=0;
//        int now=0;
//        for (int i = 0; i <s.length() ; i++) {
//            //若相等
//            if(s.charAt(i)==s2.charAt(i)){
//                //1.为初始位置
//                if(now==0){
//                    p=i;
//                }
//                //2.不为初始位置，不做
//                now++;
//            }
//            //若不相等
//            else{
//                //1.大于max
//                if(max<now){
//                    max=now;
//                }
//                //2.小于max,不做
//                now=0;
//            }
//        }
//        max=now>max?now:max;
//
//        if(max==0){
//            String s3=s.charAt(0)+"";
//            return s3;
//        }
//        else {
//            char[] chars=new char[max];
//            s.getChars(p,p+max,chars,0);
//            return new String(chars);
//        }
        //回文两种情况
        //1.aba
        //2.bb
        int max=0;
        int now=0;
        int p=0;
        for (int i = 0; i < s.length(); i++) {
            //1查找以当前元素为中心对称
            now=1;
            int x=i-1;
            int y=i+1;
            while (true){
                //若x，y有越界，则直接退出
                if(x<0||y>=s.length()||s.charAt(x)!=s.charAt(y)){
                    if(now>max){
                        max=now;
                        p=x+1;
                    }
                    now=0;
                    break;
                }
                //无越界，且左右相等
                x--;
                y++;
                now=now+2;
            }
            now=0;
            x=i;
            y=i+1;
            while (true){
                //若x，y有越界，则直接退出
                if(x<0||y>=s.length()||s.charAt(x)!=s.charAt(y)){
                    if(now>max){
                        max=now;
                        p=x+1;
                    }
                    now=0;
                    break;
                }
                //无越界，且左右相等
                x--;
                y++;
                now=now+2;
            }
        }

        String s2="";
        for(int i=0;i<max;i++){
            s2=s2+s.charAt(p);
            p++;
        }
        return s2;
    }
}
