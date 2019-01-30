package datastructures;

import org.junit.Assert;
import org.junit.Test;

public class TestMyLinkedList {

    @Test
    public void test () {
        Node n = new Node(5);
        MyLinkedList linkedList = new MyLinkedList(n);
        linkedList.insertHead(7);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertHead(1);


        Node randomNote  = new Node (12);
        linkedList.insertAfter(randomNote,20);

        boolean contains = linkedList.listContains(randomNote);
        System.out.println(contains);
        boolean contains1 = linkedList.listContains(n);
        System.out.println(contains1);



        linkedList.insertAfter(n,10);
        linkedList.printList();


    }
}
