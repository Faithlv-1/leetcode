import java.util.*;

public class four_nine {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> slm = new HashMap<>();
        for(String s:strs){
            char[] chs=s.toCharArray();
            Arrays.sort(chs);
            String s_sort=new String(chs);
            List<String> ls = slm.getOrDefault(s_sort, new ArrayList<String>());
            ls.add(s);
            slm.put(s_sort,ls);
        }
        return new ArrayList<List<String>>(slm.values());
    }
}
