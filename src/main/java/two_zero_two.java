import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class two_zero_two {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        if(n==1)
            return true;
        Set<Integer> hs = new HashSet<>();
        while (hs.add(n)){
            //计算n的快乐数
            int temp = 0;
            while (n!=0){
                int yu = n%10;
                temp+=yu*yu;
                n=n/10;
            }
            n=temp;
            if(n==1){
                return true;
            }
        }

        return false;

    }
}
