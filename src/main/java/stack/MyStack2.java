package stack;

import java.util.Arrays;

public class MyStack2 {

    private int[] elements;
    private int top;
    private int size;


    public MyStack2(int size) {
        this.elements = new int[size];
        this.top = -1;
        this.size = size;
    }

//    public MyStack2(MyStack2 myStack2) {
//
//
//        this.size = myStack2.size + myStack2.size / 2;
//        this.elements = new int[size];
//
//        for (int i = 0; i < myStack2.size; i++) {
//           this.elements[i] = myStack2.elements[i];
//        }
//        this.top = myStack2.size -1;
//
//    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public void push(int element) {

        try {
            elements[top+1] = element;
        }catch (ArrayIndexOutOfBoundsException e){
            int oldSize = this.size;
            this.size = oldSize + oldSize /2;
            int [] oldElements = elements;
            this.elements = new int [size];
            for (int i = 0; i<oldElements.length;i++){
                this.elements[i] = oldElements[i];
            }
            this.top = oldSize - 1;
            elements[top +1] = element;
        }
        top++;
    }

    public int pop() {
//        if (top<0){
//            System.out.println("Stack is empty");
//            int invalidValue = -1;
//            return invalidValue;
//        }
        int elementToBeRemoved = elements[top];
        elements[top] = 0;
        top--;
        return elementToBeRemoved;
    }

    public int peek() {
        return elements[top];
    }
}
