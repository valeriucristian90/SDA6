package stack;

import org.junit.Assert;
import org.junit.Test;

public class TestMyStack {

    @Test
    public void testSuccessfullPush() {
        MyStack stack = new MyStack(4);
        stack.push(5);
        int actual = stack.pop();
        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testOneSuccessfullPop () {
        MyStack stack = new MyStack(4);
        stack.push(5);
        int actual = stack.pop();
        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testStackSizeNotExceeded () {
        MyStack stack = new MyStack(4);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(6);
        int actual = stack.peek();
        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPeek () {
        MyStack stack = new MyStack(4);
        stack.push(3);
        int actual = stack.peek();
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testUnableToPopOutOfEmptyStack (){
        MyStack stack = new MyStack(4);
        int actual = stack.pop();
        int expected = -1;
        Assert.assertEquals(expected,actual);
    }
}
