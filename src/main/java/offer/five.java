package offer;

public class five {
    public static void main(String[] args) {
        maxProduct(new String[]{"a","ab","abc","d","cd","bcd","abcd"});
    }

    public  static int maxProduct(String[] words) {
        int[] nums = new int[words.length];
        for(int j=0;j<words.length;j++){
            for (int i=0;i<words[j].length();i++){
                //
                int move=(int) words[j].charAt(i)-'a';
                nums[j] = ((nums[j] >> move | 1) << move)|nums[j];
            }
        }

        int max=0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i+1; j <words.length ; j++) {
                if((nums[i]&nums[j])==0){
                    int length = words[i].length()*words[j].length();
                    max= length>max?length:max;
                }
            }
        }
        return max;
    }
}
