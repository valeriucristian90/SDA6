package problema;

public class PrintElementBackwards {
    public static void printElementsBackwards(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }
}