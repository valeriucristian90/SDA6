package database.key;

import org.junit.Assert;
import org.junit.Test;

public class TestMyKey {

    @Test
    public void testSuccessComparison (){
        Key myKey = new MyKey(5);
        Key myOtherKey = new MyKey(5);

        Assert.assertTrue(myKey.equals(myOtherKey));

    }
}
