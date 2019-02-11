package collection;

import java.text.CollationElementIterator;
import java.util.*;

public class MySet {

    public static void main(String[] args) {
        Set <Integer> a = new HashSet<>();
        Set <Integer> b = new HashSet<>();
        Set <Integer> clone = new HashSet<>();

        a.add(1);
        a.add(3);
        a.add(2);
        b.add(3);
        b.add(4);
        b.add(7);

        boolean x = a.retainAll(b);

        System.out.println(x);

        List <Integer> c = new ArrayList<>(a);

        c.add(1);

        System.out.println(a);
        System.out.println(c);

        System.out.println(a.size());

        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }

        System.out.println();

//        a.clear();
//        System.out.println(a);

        System.out.println(a.isEmpty());

        clone = (Set<Integer>) ((HashSet<Integer>) a).clone();
        System.out.println(clone);

       a.removeAll(a);
        System.out.println(a);


    }
}
