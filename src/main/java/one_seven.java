import java.util.ArrayList;
import java.util.List;

public class one_seven {
    public static void main(String[] args) {
        String s="23";
        letterCombinations(s);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> last_ls = new ArrayList<>();
        if(digits.length()==0)
            return last_ls;
        //动态规划
        String[][] s= {{"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}
        };

        int num_first=(int) (digits.charAt(0)-'0');
        for(int i=0;i<s[num_first-2].length;i++){
            last_ls.add(s[num_first-2][i]);
        }
        //从第二个开始遍历
        for(int i=0;i<digits.length();i++){
            List<String> now_ls = new ArrayList<>();
            //获取当前数值
            int num=(int) (digits.charAt(i)-'0');
            //遍历次数为当前数值对应字母的个数
            for(int j=0;j<s[num-2].length;j++){
                for(String last:last_ls){
                    now_ls.add(last+s[num-2][j]);
                }
            }

            last_ls.clear();
            last_ls=now_ls;
        }

        return last_ls;
    }
}
