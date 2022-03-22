public class two_eight {
    public static void main(String[] args) {
        String a="asdww";
        String b="ww";
        System.out.println(strStr(a,b));
    }
    public static int strStr(String haystack, String needle) {
        if(needle==""){
            return 0;
        }
        int i=0;
        for(i=0;i<haystack.length()-needle.length()+1;i++){
            int j=0;
            for(j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==needle.length()){
                return i;
            }

        }

        return -1;
    }
}
