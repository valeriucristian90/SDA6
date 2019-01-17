package love;

import java.sql.Array;
import java.util.ArrayList;

public class PrimeInsideArray {

    public ArrayList primeNumber(int[] x) {

        NumberIsPrime isPrim = new NumberIsPrime();
        ArrayList newArray = new ArrayList();

        for (int i = 0; i < x.length; i++) {
            if (isPrim.numberIsPrime(x[i])) {
                newArray.add(x[i]);
            }
        }
        return newArray;
    }

}
