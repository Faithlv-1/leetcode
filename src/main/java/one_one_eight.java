import java.util.ArrayList;
import java.util.List;

public class one_one_eight {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        ls=generate(5);
        System.out.println(99);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> front=new ArrayList<>();
        for (int i = 1; i < numRows+1; i++) {
            List<Integer> now = new ArrayList<>();
            if(i==1){
                now.add(1);
            }
            else{
                for (int j = 1; j <i+1 ; j++) {
                    if(j==1||j==i){
                        now.add(1);
                    }
                    else
                        now.add(front.get(j-2)+front.get(j-1));
                }

            }

            ls.add(now);
            front=null;
            front=now;

        }

        return ls;
    }
}
