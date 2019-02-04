package polimorfism;

import org.junit.Test;

public class TestPlan {

    @Test
    public void test () {

        Punct a = new Punct(1, 2);
        Punct b = new Punct(3, 4);
        Punct c = new PunctColor(1, 2, "rosu");
        Punct d = new PunctColor(1, 2, "verde");
        Punct e = new Punct3D(1, 2, 3);
        Punct f = new Punct3D(3, 2, 1);

        Punct[] x = {a, b, c, d, e, f};
        Plan y = new Plan();
        y.plan(x);

    }
}
