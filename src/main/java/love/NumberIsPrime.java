package love;

import java.util.Scanner;

public class NumberIsPrime {


    public boolean numberIsPrime(int a) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Insert a number");
//        int x = input.nextInt();


        boolean test = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                test = false;

            }
        }
        return test;

    }

}
