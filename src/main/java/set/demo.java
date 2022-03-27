package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//set,元素不可重复，无顺序
public class demo {
    public static void main(String[] args) {
        //hashset
        Set<Integer> it = new HashSet<>();
        //增
        it.add(1);
        it.add(1);
        it.add(2);
        it.add(3);
        System.out.println(it);
        System.out.println("----------");
        //删
        it.remove(1);
        System.out.println(it);
        System.out.println("----------");

        //改
        //
        //linkedhashset
        Set<Integer> it2 = new LinkedHashSet<>();
        //增
        it2.add(1);
        it2.add(1);
        it2.add(2);
        it2.add(3);
        it2.add(3);
        System.out.println(it2);
        System.out.println("----------");
        //删
        it2.remove(3);
        System.out.println(it2);
        System.out.println("----------");

        //查是否含有
        System.out.println(it2.contains(3));
        System.out.println(it2.contains(2));



    }

}
