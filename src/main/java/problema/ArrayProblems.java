package problema;

public class ArrayProblems {
    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PrintOneAfterAnother.printOneAfterAnother(x);
        System.out.println();
        PrintElementBackwards.printElementsBackwards(x);
        System.out.println();
        OddNumbers.oddNumbers(x);
        System.out.println();
        numberDivisibleWith3(x);
        System.out.println();
        sumOfInteger(x);
        sumOfFirstFourthNumber(x);
    }


    public static void numberDivisibleWith3(int[] x) {
        int number = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 3 == 0) {
                number = x[i];
                System.out.print(number + " ");
            }
        }
    }

    public static void sumOfInteger(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        System.out.println(sum);
    }

    public static void sumOfFirstFourthNumber(int[] x) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + x[i];
        }
        System.out.println(sum);
    }

//    public static void sumOfLastIntegersBiggerThanTwo(int[] x){
//        int sum=0;
//        int counter=0;
//        for(int i= )
//    }
}
