package love;

public class FibonacciSequence {

    public int fibonacci(int x) {
        if (x <= 1){
            return x;
        }else{
            return fibonacci(x-1)+fibonacci(x-2);
        }

    }
}
