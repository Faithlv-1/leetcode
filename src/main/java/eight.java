public class eight {
    public static void main(String[] args) {
        String s="asdsad-23";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        //
        boolean shu_flag=false;
        boolean start=false;
        String ss="";
        for(int i=0;i<s.length();i++){
            char now=s.charAt(i);
            //读取+或-，判断是否开始
            if(now=='+'||now=='-'){
                if(start){
                    break;
                }
                else {
                    ss+=now;
                    start=true;
                }
            }
            //读取数子
            else if(now>='0'&&now<='9'){
                if(!start)
                    start=true;
                if(!shu_flag)
                    shu_flag=true;
                ss+=now;
            }
            //其他
            else {
                if(start)
                    break;
            }
        }
        if(start&&!shu_flag){
            return 0;
        }
        long num=Long.parseLong(ss);
        //
        long max= (long) Math.pow(2,31)-1;
        long min= (long) Math.pow(-2,31);
        if(num>max)
            num=max;
        else if(num<min)
            num=min;
        return (int) num;
    }
}
