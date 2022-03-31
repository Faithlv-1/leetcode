public class one_two {
    public static void main(String[] args) {
        intToRoman(40);

    }

    public static String intToRoman(int num) {
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s= new String[]{"M", "CM", "D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        int p=0;
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            //当前指针值大于num
            if(value[p]>num){
                p++;
                continue;
            }
            else
            {
                sb.append(s[p]);
                num=num-value[p];
            }
        }

        return sb.toString();
    }

}
