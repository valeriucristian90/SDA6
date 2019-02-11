package collection;

import java.util.*;

public class MyLinkedList {

    public static void main(String[] args) {

        List <Integer> a = new LinkedList<>();
        List <Integer> b = new LinkedList<>();
        a.add(1);
        ((LinkedList<Integer>) a).addFirst(2);
        a.add(3);
        a.add(5);
        a.add(8);
        a.add(2);
        a.add(4);
        System.out.println(a);
        System.out.println(((LinkedList<Integer>) a).getFirst());
        System.out.println(((LinkedList<Integer>) a).getLast());

        Iterator<Integer> iterator = a.listIterator(3);
        while (iterator.hasNext()){
        System.out.print(iterator.next()+" ");}

        System.out.println(((LinkedList<Integer>) a).getFirst());


        Collections.reverse(a);

        Iterator<Integer> integerIterator = ((LinkedList<Integer>) a).descendingIterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next()+" ");}

        System.out.println();

        ((LinkedList<Integer>) a).addLast(152);
        ((LinkedList<Integer>) a).addFirst(100);
        System.out.println(a);

        a.add(3,80);
        System.out.println(a);

        for (int i = 0; i<a.size();i++){
            System.out.println("at position : "+i+" "+ "value is : "+a.get(i));
        }
        System.out.println(a);
        a.remove(4);
        System.out.println(a);

        ((LinkedList<Integer>) a).removeFirst();
        ((LinkedList<Integer>) a).removeLast();
        System.out.println(a);

//        a.removeAll(a);
//        System.out.println(a);

//        Collections.swap(a,0,1);
//        System.out.println(a);
//
//        Collections.shuffle(a);
//        System.out.println(a);

//        b= (List<Integer>) ((LinkedList<Integer>) a).clone();
//        System.out.println(b);

        System.out.println(((LinkedList<Integer>) a).pop());
        System.out.println(a);

        System.out.println(a.contains(3));
        System.out.println(a.contains(33));

        List <Integer> convert = new ArrayList<>(a);
        System.out.println(convert);

        System.out.println(a.isEmpty());

        a.set(0,300);
        System.out.println(a);




    }
}
