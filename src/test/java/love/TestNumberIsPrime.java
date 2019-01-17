package love;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class TestNumberIsPrime {
    @Test
    public void testThatACertainNumberIsPrime (){

        int a=7;
        NumberIsPrime prim = new NumberIsPrime();
        boolean actualResult = prim.numberIsPrime(a);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testThatANumberIsNotPrime (){
        int x = 6;
        NumberIsPrime prim = new NumberIsPrime();
        boolean actualResult = prim.numberIsPrime(x);
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult,actualResult);
    }
}


