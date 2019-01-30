package stack;

import java.util.Arrays;

public class MyStack {

    private int [] elements;
    private int top;
    private int size;

    public MyStack(int size) {
        this.elements = new int[size];
        this.top = -1;
        this.size = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public void push (int element){
        if(top + 1 == size){
            System.out.println("Stack is full");
            return;
        }
        elements [top +1] = element;
        top++;
    }

    public int pop (){
        if (top<0){
            System.out.println("Stack is empty");
            int invalidValue = -1;
            return invalidValue;
        }
        int elementToBeRemoved = elements[top];
        elements[top] = 0;
        top --;
        return elementToBeRemoved;
    }

    public int peek (){
        return elements[top];
    }
}
