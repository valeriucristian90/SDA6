package problema;

public class OddNumbers {
    public static void oddNumbers(int[] x) {
        int odd = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                odd = x[i];
                System.out.print(odd + " ");
            }
        }
    }
}