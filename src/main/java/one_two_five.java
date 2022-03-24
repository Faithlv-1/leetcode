public class one_two_five {
    public static void main(String[] args) {
        String s= "OP";
        boolean flag=isPalindrome(s);
        System.out.println("ads");
    }
    public static boolean isPalindrome(String s) {
        s=isPalindrome2(s);
        boolean flag=true;
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
                break;
            }
        }
        return flag;
    }

    //将字符串中不属于字母删除，且将大写转为小写
    public static String isPalindrome2(String s){
        String now="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='Z'&&s.charAt(i)>='A'){
                now=now+(char)(s.charAt(i)-'A'+'a')+"";

            }
            else if(s.charAt(i)<='z'&&s.charAt(i)>='a'){
                now=now+s.charAt(i)+"";

            }
        }

        return now;
    }
}
