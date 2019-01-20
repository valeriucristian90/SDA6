package love;

import org.junit.Assert;
import org.junit.Test;

public class TestfibonacciSequence {

    @Test
    public void testFibonacci (){
        FibonacciSequence x = new FibonacciSequence();

        int expectedResult = 0;
        int actualResult = x.fibonacci(0);
        Assert.assertEquals(expectedResult,actualResult);

        System.out.println(x.fibonacci(20));
    }
}
