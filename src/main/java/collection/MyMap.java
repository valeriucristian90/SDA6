package collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        a.put(0,4);
        a.put(1,3);
        a.put(2,7);

        b.put(1,3);
        b.put(0,4);
        b.put(1,9);


        System.out.println(a.containsKey(0));
        System.out.println(a.containsValue(4));

        System.out.println(a.keySet());
        System.out.println(a.values());

        System.out.println(a.entrySet());

        System.out.println(a.equals(b));

        System.out.println(a.size());


    }
}
