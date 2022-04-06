import java.util.HashMap;
import java.util.HashSet;

public class two_zero_five {
    public static void main(String[] args) {
        isIsomorphic("badc","baba");
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        int len = s.length();
        int p =0;
        while (p<len){
            char sc = s.charAt(p);
            char tc = t.charAt(p);
            if(hm1.get(sc)==null&&hm2.get(tc)==null){
                hm1.put(sc,tc);
                hm2.put(tc,sc);
                p++;
                continue;
            }

        }
        return true;

    }
}
