package geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestDreptunghi {

    @Test
    public void TestCalculeazaArie() {

        Dreptunghi x = new Dreptunghi(2, 3);
        System.out.println(x.CalculeazaArie());
        Assert.assertEquals(6, x.CalculeazaArie());

    }

    @Test
    public void TestCalculeazaPerimetru() {
        Dreptunghi x = new Dreptunghi(2, 3);
        System.out.println(x.CalculeazaPerimetru());
        Assert.assertEquals(12, x.CalculeazaPerimetru());

    }

}
