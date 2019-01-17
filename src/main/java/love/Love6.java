package love;

public class Love6 {

    public boolean lucky6(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if (a == 6 || b == 6) {
            result = true;
        }
        if (sum == 6) {
            result = true;
        }

        if (a - b == 6 || b - a == 6) {
            result = true;
        }

        return result;
    }
}