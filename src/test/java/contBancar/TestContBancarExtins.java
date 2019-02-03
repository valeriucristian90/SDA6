package contBancar;

import org.junit.Test;

public class TestContBancarExtins {

    @Test
    public void test (){
        ContBancar b = new ContBancarExtins(200,2);
        ContBancarExtins c = new ContBancarExtins(100,1);
        ((ContBancarExtins) b).adaugaDobandaLunara();
        c.adaugaDobandaLunara();
        System.out.println(c);
        System.out.println(b);

        b.adauga(20);

       b.afisare();
       c.afisare();
    }
}
