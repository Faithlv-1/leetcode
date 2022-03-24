import java.util.ArrayList;
import java.util.List;

public class one_one_nine {
    public static void main(String[] args) {
        List<Integer> demo = new ArrayList<>();
        demo=getRow(3);
        System.out.println("ss");
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> last = new ArrayList<>();
        List<Integer> now = new ArrayList<>();
        if(rowIndex==0){
            now.add(1);
            return now;
        }
        last=getRow(rowIndex-1);
        for (int i = 0; i < rowIndex+1; i++) {
            if(i==0||i==rowIndex)
                now.add(1);
            else
                now.add(last.get(i-1)+last.get(i));
        }
        return now;
    }
}
