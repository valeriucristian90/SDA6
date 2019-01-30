package bubbleSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestBubbleSort {

    @Test
    public void testBubbleSort () {
        int a[] = {2,1,7,4,3};
        BubbleSort sort = new BubbleSort();
        int[] x = sort.bubbleSort(a);
        System.out.println(Arrays.toString(x));
        int [] expected = {1,2,3,4,7};
        Assert.assertEquals(Arrays.toString(expected),Arrays.toString(x));
    }
}
