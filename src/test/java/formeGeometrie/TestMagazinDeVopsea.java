package formeGeometrie;

import org.junit.Test;

public class TestMagazinDeVopsea {

    @Test
    public void test (){
        FormaGeometrica patrat = new Patrat(2);
        FormaGeometrica triunghi = new Triunghi(2,3);
        FormaGeometrica cerc = new Cerc(3);
        FormaGeometrica dreptunghi = new Dreptunghi(2,3);




        FormaGeometrica forme [] = {patrat, triunghi, cerc, dreptunghi};
        MagazinDeVopsea x = new MagazinDeVopsea();
        x.cantitateaTotalaDeVopsea(forme);
        System.out.println(x.cantitateaTotalaDeVopsea(forme));



    }
}
