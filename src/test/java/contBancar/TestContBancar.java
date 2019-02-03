package contBancar;

import org.junit.Test;

public class TestContBancar {

    @Test
    public void test (){
        ContBancar a = new ContBancar(200);
        a.extrage(300);
        a.adauga(50);
        a.extrage(100);
        System.out.println(a);


    }
}
