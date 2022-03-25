import java.util.ArrayList;
import java.util.List;

public class one_six_eight {
    public static void main(String[] args) {
        convertToTitle(701);
        System.out.println("ss");
    }
//    public static String convertToTitle(int columnNumber) {
//        List<Integer> ls = new ArrayList<Integer>();
//        int shang=columnNumber;
//        while (shang>26){
//            ls.add(shang%26);
//            shang=shang/26;
//        }
//        ls.add(shang);
//
//        return convertToTitle2(ls);
//    }
//
//    public static String convertToTitle2(List<Integer> ls){
//        String s="";
//        for (int i = ls.size()-1; i >=0 ; i--) {
//            s=s+(char)(ls.get(i)+'A'-1)+"";
//        }
//        return s;
//    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder s= new StringBuilder(new StringBuilder());
        int shang=columnNumber;
        while (shang>26){
            if(shang%26==0){
                s.append('Z');
                shang=shang/26-1;
            }
            else {
                s.append((char)(shang%26-1+'A'));
                shang=shang/26;
            }
        }
        s.append((char)(shang-1+'A'));
        return s.reverse().toString();
    }
}
