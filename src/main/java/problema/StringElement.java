package problema;

public class StringElement {

    public static void main(String[] args) {

        String y = centruString("aAbcd");
        System.out.println(y);


    }

    static String centruString(String lista) {

        int element1 = 0;
        int element2 = 0;


        if (lista.length() % 2 == 0) {

            element1 = lista.length() / 2 - 1;
            element2 = 2;
        } else {
            element1 = lista.length() / 2;
            element2 = 1;
        }

        return lista.substring(element1, element1 + element1);

    }
}
