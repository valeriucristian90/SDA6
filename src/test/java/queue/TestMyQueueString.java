package queue;

import org.junit.Test;

public class TestMyQueueString {

    @Test
    public void testQueueString () {
        MyQueueString a = new MyQueueString(5);
        System.out.println(a);
        a.enqueue("Vlad");
        a.enqueue("Maria");
        System.out.println(a);
        a.dequeue();
        System.out.println(a);
    }
}
