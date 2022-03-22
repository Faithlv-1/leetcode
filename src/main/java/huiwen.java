// 9 回文数

import java.util.ArrayList;

public class huiwen {
    public static void main(String[] args) {
        huiwen hw = new huiwen();
        System.out.println(hw.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        //先判断正负
        //负数
        if(x<0){
            return false;
        }
        else if(x==0)
        {
            return true;
        }
        //正数
        ArrayList<Integer> list = new ArrayList<Integer>();
        int chu=10;
        while(x>0){
            int a=x%chu;
            x=x/10;
            list.add(a);
        }
        int i=0;
        int j=list.size()-1;
        //判断是否为回文数字
        for(;i<j;i++,j--){
            if(list.get(i)!=list.get(j)){
                return false;
            }
        }

        return true;
    }


}

