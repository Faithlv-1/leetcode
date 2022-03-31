import java.util.HashSet;
import java.util.Set;

public class three {
    public static void main(String[] args) {
        String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {

        int max=0;
        int now=0;
        Set<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            //成功
            if(hs.add(s.charAt(i))){
                now++;
            }
            //失败
            else{
                //清空hashset
                hs.clear();
                max=now>max?now:max;
                now=0;
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(j)==s.charAt(i)){
                       i=j;
                       break;
                    }
                }
            }
        }

        max=now>max?now:max;
        return max;

    }
}
