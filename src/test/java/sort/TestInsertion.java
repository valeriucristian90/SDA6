package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestInsertion {

    @Test
    public void test () {
        int [] noToBeSorted = {6,4,3,2,1,5,9};
        Insertion is = new Insertion();
        is.insertionSort(noToBeSorted);

        System.out.println(Arrays.toString(noToBeSorted));
    }
}
