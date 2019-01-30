package author;

import org.junit.Test;

public class TestAuthor {

    @Test
    public void testAuthor () {
        Author a = new Author("Autor necunoscut","email@yahoo.com",'m');
        System.out.println(a);
        a.setEmail("emailnou@yahoo.com");
        System.out.println(a);
    }
}
