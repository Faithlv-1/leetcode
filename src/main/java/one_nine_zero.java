public class one_nine_zero {
    public static void main(String[] args) {
        int i=1;
        reverseBits(1);
    }
//    public static int reverseBits(int n) {
//        int res=0;
//        for(int i=0;i<32;i++){
//            res=(res<<1)|(n&1);
//            n=n>>>1;
//        }
//        return res;
//    }

    public static int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }


}
