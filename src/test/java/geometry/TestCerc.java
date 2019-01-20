package geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestCerc {

    @Test
    public void TestArieCerc() {

        Cerc x = new Cerc(3);
        System.out.println(x.CalculeazaAria());
        Assert.assertEquals(9 * Math.PI, x.CalculeazaAria(), Math.PI);
    }

    @Test
    public void TestCircumferintaCerc() {

        Cerc x = new Cerc(3);
        System.out.println(x.CalculeazaCircumferinta());
        Assert.assertEquals((2 * Math.PI) * 3, x.CalculeazaCircumferinta(), Math.PI);
    }
}
