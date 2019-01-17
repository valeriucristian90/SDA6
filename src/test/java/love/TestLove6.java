package love;

import org.junit.Assert;
import org.junit.Test;

public class TestLove6 {
    @Test
    public void testSOneNumber6Correct() {

        int x = 3;
        int y = 6;

        Love6 sum = new Love6();
        boolean actualResult = sum.lucky6(x,y);
        boolean expectedResult = true;

        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(true,sum.lucky6(6,3));

    }
}
