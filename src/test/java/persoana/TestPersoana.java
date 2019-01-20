package persoana;

import org.junit.Assert;
import org.junit.Test;

import java.util.AbstractSequentialList;

public class TestPersoana {

    @Test
    public void TestPersoana (){
        Persoana a = new Persoana(20,"Adi","masculin","casatorit","Ioana");
        Persoana b = new Persoana(19,"Oana","feminin","casatorit","Marius");
        Persoana c = new Persoana(7,"Andrei","masculin","necasatorit");
        Persoana d = new Persoana(38,"Monica","feminin","necasatorit");
        Persoana e = new Persoana(23,"Vlad","masculin","casatorit","Maria");
        Persoana f = new Persoana(23,"Vlad","masculin","necasatorit");
        Persoana g = new Persoana(23,"Vlad","masculin","necasatorit");


        Assert.assertEquals(20,a.getVarsta());
        Assert.assertEquals("masculin",a.getSex());
        Assert.assertEquals("Adi",a.getNume());




    }

}
