import java.lang.invoke.VarHandle;

public class six_six {
    public static void main(String[] args) {
        int[] array={9,8,7,6,5,4,3,2,1,0};

        System.out.println(plusOne(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static int[] plusOne(int[] digits) {
        boolean sign=true;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]!=9){
                sign=false;
                break;
            }
        }
        //进位
        if(sign==true){
            int[] digits2 = new int[digits.length + 1];
            digits2[0]=1;
            for (int i = 1; i <digits2.length ; i++) {
                digits2[i]=0;
            }
            return digits2;
        }
        //无全进位
        else {
            for (int i = digits.length-1; i >=0 ; i--) {
                if(digits[i]==9){
                    digits[i]=0;
                    continue;
                }
                else {
                    digits[i]++;
                    break;
                }
            }
            return digits;
        }
    }
}
