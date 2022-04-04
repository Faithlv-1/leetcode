public class KMP {
    public static void main(String[] args) {
        kmp("aweqsadaaacdasdw","a");
    }

    //判断s1中是否有s2
    public static boolean kmp(String s1,String s2){
        if(s1.length()<s2.length()){
            return false;
        }

        int[] next = new int[s2.length()];
        //计算next[]
        nextCount(s2,next);
        //
        int p1=1;
        int p2=1;
        //退出比较
        while(p2<s2.length()+1&&p1<s1.length()+1){
            if(p2==1){
                p2++;
                p1++;
                continue;
            }
            //比较成功
            char c1= s1.charAt(p1-1);
            char c2= s2.charAt(p2-1);

            if(c1==c2){
                p2++;
                p1++;
                continue;
            }
            //比较失败
            else if(c1!=c2){
                p2=next[p2-1];
                continue;
            }
        }
        if(p2==s2.length()+1)
            return true;
        return false;
    }

    public static void nextCount(String s2,int[] next){
        //
        if(s2.length()==1){
            next[0]=1;
            return;
        }
        next[0]=0;
        next[1]=1;
        int first1=0;
        int first2=1;
        for (int i = 2; i <s2.length() ; i++) {
            if(s2.charAt(first1)==s2.charAt(first2)){
                next[i]=next[i-1]+1;
            }
            else{
                next[i]=1;
            }
        }
    }

}
