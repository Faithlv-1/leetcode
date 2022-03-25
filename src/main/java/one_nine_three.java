import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class one_nine_three {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(file);
        List<String> slist = new ArrayList<>();
        String s="";
        while((s=br.readLine())!=null){
            slist.add(s);
        }
        file.close();


    }

}
