package generics;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.List;

public class TestArrayToList {

    @Test
    public void testMyMethod (){
        Integer[] intArray = {1,2,3,4,5};
        String [] strArray = {"A","b","C"};

        ArrayToList a = new ArrayToList();
        List<String> actualStrList = a.arrayToList(strArray);
        List<Integer> actualIntList = a.arrayToList(intArray);
        Assert.assertEquals("A",actualStrList.get(0));
        Assert.assertEquals(new Integer(1),actualIntList.get(0));
    }
}
