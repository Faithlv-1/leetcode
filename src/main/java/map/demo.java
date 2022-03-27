package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        //hashmap
        Map<String, Integer> hm = new HashMap<>();
        //增
        hm.put("a",1);
        hm.put("b",1);
        hm.put("b",2);
        hm.put("c",2);
        System.out.println(hm);
        System.out.println("--------");
        //删除
        hm.remove("b");
        hm.remove("c",1);
        System.out.println(hm);
        System.out.println("--------");

        //查
        System.out.println(hm.get("a"));
        System.out.println(hm.get("b"));
        System.out.println(hm);
        System.out.println("--------");

        //改
        System.out.println(hm.put("a",2));
        System.out.println(hm.put("c",2));
        System.out.println(hm.replace("c",4));
        System.out.println(hm);
        System.out.println("--------");

        //linkedhashmap
        Map<String, Integer> lhm = new LinkedHashMap<>();

        //增
        System.out.println(lhm.put("a",2));
        System.out.println(lhm.put("a",1));
        System.out.println(lhm.put("b",10));
        System.out.println(lhm.put("c",20));
        System.out.println(lhm);
        System.out.println("--------");

        //删除

        //treemap
    }

}
