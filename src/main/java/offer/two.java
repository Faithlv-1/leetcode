package offer;

import java.util.logging.Level;

public class two {
    public static void main(String[] args) {
        addBinary("011","011");
    }
    public static String addBinary(String a, String b) {
        int carry=0;
        int p=a.length()-1;
        int q=b.length()-1;
        StringBuffer s= new StringBuffer();
        while(p>=0||q>=0||carry!=0){
            int anum=0;
            int bnum=0;
            if(p<0&&q>=0){
                bnum=(int) (b.charAt(q)-'0');
                q--;
            }
            else if(p>=0&&q<0){
                anum=(int)(a.charAt(p)-'0');
                p--;
            }
            else if(p>=0&&q>=0){
                bnum=(int) (b.charAt(q)-'0');
                q--;
                anum=(int)(a.charAt(p)-'0');
                p--;
            }
            int res=(anum+bnum+carry)%2;
            carry=(anum+bnum+carry)/2;
            s.append(res);
        }

        return new String(s.reverse());
    }
}
