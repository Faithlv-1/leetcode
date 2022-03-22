import javax.lang.model.util.ElementScanner6;
import java.lang.annotation.ElementType;
import java.util.logging.Level;

public class six_seven {
    public static void main(String[] args) {
        String a="11";
        String b="10";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        //将后面共同相加
        StringBuilder s= new StringBuilder();
        int a_p=a.length()-1;
        int b_p=b.length()-1;
        int carry=0;
        while(a_p>=0||b_p>=0||carry==1){
            int a_int;
            int b_int;
            if(a_p>=0)
                a_int=a.charAt(a_p)-'0';
            else
                a_int=0;
            if(b_p>=0)
                b_int=b.charAt(b_p)-'0';
            else
                b_int=0;
            a_p--;
            b_p--;
            int count=a_int+b_int+carry;
            if(count>=2){
                char app= (char) (count-2+'0');
                s.append(app);
                carry=1;
            }
            else {
                char app= (char) (count+'0');
                s.append(app);
                carry=0;
            }
        }

        return String.valueOf(s.reverse());


    }
}
