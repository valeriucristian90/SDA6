package generics;

import formeGeometrie.Patrat;
import geometry.Cerc;
import org.junit.Test;

public class TestMyMethod {

    @Test
    public void test (){
        MyMethod<String>  a = new MyMethod("a","b");
        MyMethod b = new MyMethod(1,2);
        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}
