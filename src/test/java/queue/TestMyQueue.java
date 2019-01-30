package queue;

import org.junit.Test;

public class TestMyQueue {

    @Test
    public void test () {
        MyQueue a = new MyQueue(4);
        System.out.println(a);
        a.enqueue(1);
        a.enqueue(5);
        a.enqueue(4);
        a.enqueue(7);
        System.out.println(a);
        a.dequeue();
        a.dequeue();
        System.out.println(a);
        a.enqueue(4);
        System.out.println(a);
        a.enqueue(5);
//        System.out.println(a);
//        a.dequeue();
//        System.out.println(a);
//        a.enqueue(2);
//        a.enqueue(2);
//        System.out.println(a);
        a.peek();
        System.out.println(a.peek());






    }
}
