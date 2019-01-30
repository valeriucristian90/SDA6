package geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestCerc {

    @Test
    public void TestArieCerc() {

        Cerc x = new Cerc(3);
        System.out.println(x.CalculeazaAria());
        Assert.assertEquals(28.274, x.CalculeazaAria(), 3);
    }

    @Test
    public void TestCircumferintaCerc() {

        Cerc x = new Cerc(3);
        System.out.println(x.CalculeazaCircumferinta());
        Assert.assertEquals((2 * Math.PI) * 3, x.CalculeazaCircumferinta(), 3);
    }
}
