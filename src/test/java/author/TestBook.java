package author;

import org.junit.Test;

public class TestBook {

    @Test
    public void testBook () {
        Author author = new Author("Author","email@yahoo.com",'m');
        Book firstBook = new Book("First Book",author,19.99);
        System.out.println(firstBook);

    }
}
