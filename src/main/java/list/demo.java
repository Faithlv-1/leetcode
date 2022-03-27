package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//list,有序，可重复
public class demo {
    public static void main(String[] args) {
        //arraylist,底部数据结构是数组
        List<Integer> it = new ArrayList<>();
        //增
        it.add(1);
        it.add(2);
        it.add(2);
        //查
        System.out.println(it.get(2));
        //改
        it.set(0,9);
        System.out.println(it.get(0));
        //删
        it.remove(0);
        System.out.println(0);

        List<Integer> it2 = new LinkedList<>();
        //如上


    }
}
