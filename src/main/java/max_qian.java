//字符串最大前缀
public class max_qian {
    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower","flower"};
        max_qian max_qian = new max_qian();
        System.out.println(max_qian.longestCommonPrefix(strs));

    }

    public String longestCommonPrefix(String[] strs) {
        String ton="";
        if(strs==null)
            return ton;
        else if(strs.length==1)
            return strs[1];
//        System.out.println(strs[0].charAt(3));
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);
            char b = 0;
            for(int j=1;j<strs.length;j++){
                if(i>strs[j].length()-1)
                    return ton;
                b= strs[j].charAt(i);
                if(b!=a)
                    return ton;
            }
            String c = b+"";
            ton = ton+c;
        }
        return ton;

    }

}
