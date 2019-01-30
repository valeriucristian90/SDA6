package queue;

import java.util.Arrays;

public class MyQueue {
    private int[] elements;
    private int head;
    private int tail;
    private int size;


    public MyQueue(int size) {
        this.elements = new int[size];
        this.head = 0;
        this.tail = tail;
        this.size = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);

    }

    public void enqueue(int element) {
        if (tail == (head -1)){
            System.out.println("Queue is full");
            return;
        }
        elements[tail] = element;
        tail++;
        tail %= size;

    }


    public int dequeue() {

        if (head == tail) {
            System.out.println("Queue is empty");
        }
        int elementRemoved = elements[head];
        elements[head] = 0;
        head++;
        head = head % size;

        return elementRemoved;
    }

    public int peek (){
        int peek = elements[head];
        return peek;
    }
}
