public class five_eight {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String a="";
        boolean kai=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                kai=true;
                a=a+s.charAt(i)+"";
            }
            else if(s.charAt(i)==' '&&kai==true){
                break;
            }
        }

        return a.length();
    }
}
