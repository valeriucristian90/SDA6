package punct3D;

import org.junit.Test;

public class TestPunct3DColor {

    @Test
    public void test () {
        Punct3D a = new Punct3DColor(1,2,3,"rosu");
        Punct3D c = new Punct3DColor(1,2,3,"rosu");
        Punct3D b = new Punct3DColor(4,5,6,"mov");

        ((Punct3DColor) a).compara(b);
        System.out.println(((Punct3DColor) a).compara(c));
        System.out.println(((Punct3DColor) a).compara(b));
        a.distanta(b);
        System.out.println(a.distanta(b));
        a.afisare();
        a.muta(1,1,1);
        a.afisare();

    }
}
