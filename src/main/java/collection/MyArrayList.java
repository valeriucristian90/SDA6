package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<Integer> twoArray = new ArrayList<>();
        List<String> d = new ArrayList<>();
        d.add("rosu");
        d.add("albastru");
        d.add("verde");
        System.out.println(d);

        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(0);

        e.add(312);
        e.add(142);

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()){
        System.out.print(iterator.next()+" ");}

        System.out.println();

        a.add(0,12);
        System.out.println(a);

        System.out.println(a.get(1));

        a.set(1,30);
        System.out.println(a);

        System.out.println(a.contains(12));
        System.out.println(a.contains(2));

        a.remove(2);
        System.out.println(a);

        //b=a;
        b.addAll(a);
        //b.add(new Integer(a.get(0)));
        System.out.println(b);

        Collections.swap(a,1,2);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);

        Collections.reverse(a);
        System.out.println(a);

        Collections.shuffle(a);
        System.out.println(a);

        c = a.subList(0,3);
        System.out.println(c);

        twoArray.addAll(a);
        twoArray.addAll(e);
        System.out.println(twoArray);

        System.out.println(((ArrayList<Integer>) a).clone());

//        a.removeAll(a);
//        System.out.println(a);

        System.out.println(a.isEmpty());

       // ((ArrayList<Integer>) a).trimToSize();

        ((ArrayList<Integer>) a).ensureCapacity(20);
        System.out.println(a);
        a.set(1,13);
        System.out.println(a);











    }


}
