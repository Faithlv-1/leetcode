import java.util.Stack;

public class two_zreo {
    public static void main(String[] args) {
        String s1="{[]}";
        String s2="[}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String s){
//        //若为空
//        if(s==null){
//            return false;
//        }
//        //不为空
//        for(int i=0;i<s.length();i=i+2){
//            char first= s.charAt(i);
//            char second= s.charAt(i+1);
//            if(first=='('&& second==')'){
//                continue;
//            }
//            else if(first=='['&& second==']'){
//                continue;
//            }
//            else if(first=='{'&& second=='}'){
//                continue;
//            }
//            return false;
//        }
//        return true;

        Stack<Character> chrsk = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            char now=s.charAt(i);
            //判断栈是否为空
            if(chrsk.isEmpty()){
                //栈为空，则直接入栈
                chrsk.push(now);
                continue;
            }
            //判断当前字符是否和栈顶元素对应
            char top =chrsk.peek();
            if(now==')'&&top=='('){
                chrsk.pop();
                continue;
            }
            else if(now==']'&&top=='['){
                chrsk.pop();
                continue;
            }
            else if(now=='}'&&top=='{'){
                chrsk.pop();
                continue;
            }
            //若不符合上规则，入栈
            else {
                chrsk.push(now);
            }
        }

        return chrsk.isEmpty();


    }
}
