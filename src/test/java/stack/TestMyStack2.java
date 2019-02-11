package stack;

import org.junit.Assert;
import org.junit.Test;

public class TestMyStack2 {

    @Test
    public void test (){
        MyStack2 a = new MyStack2(2);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(3);
        a.push(3);
        a.push(3);
//
//        a.push(5);
        System.out.println(a);
//        try {
//            a.push(3);
//        }catch (ArrayIndexOutOfBoundsException e){
//
//           a = new MyStack2(a);
//            System.out.println(a);
//            a.push(3);
//            System.out.println(a);
//        }

    }
}
