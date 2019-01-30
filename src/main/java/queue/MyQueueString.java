package queue;

import java.util.Arrays;

public class MyQueueString {

    private String [] string;
    private int head;
    private int tail;
    private int size;


    public MyQueueString (int size) {
        this.string = new String[size];
        this.head = 0;
        this.tail = tail;
        this.size = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(string);

    }

    public void enqueue(String element) {
        if (tail == (head -1)){
            System.out.println("Queue is full");
            return;
        }
        string[tail] = element;
        tail++;
        tail %= size;

    }


    public String dequeue() {

        if (head == tail) {
            System.out.println("Queue is empty");
        }
        String elementRemoved = string[head];
        string[head] = "null";
        head++;
        head = head % size;

        return elementRemoved;
    }

    public String peek (){
        String peek = string[head];
        return peek;
    }
}
