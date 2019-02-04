package punct3D;

import org.junit.Test;

public class TestPunct3D {

    @Test
    public void test () {
        Punct3D a = new Punct3D(1,2,3);
        Punct3D b = new Punct3D(1,2,3);
        a.afisare();
        a.compara(b);
        System.out.println(a.compara(b));
        a.muta(1,1,1);
        a.afisare();
        a.distanta(b);
        System.out.println(a.distanta(b));

    }
}
