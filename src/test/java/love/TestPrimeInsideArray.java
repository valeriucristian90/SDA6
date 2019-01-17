package love;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestPrimeInsideArray {

    @Test
    public void testNumberPrimeInsideArray(){
        int [] newArray = {1, 2, 3, 5, 7, 10, 12};
        ArrayList expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        PrimeInsideArray list = new PrimeInsideArray();
        ArrayList actual = list.primeNumber(newArray);

        Assert.assertEquals(expected,actual);

    }
}
