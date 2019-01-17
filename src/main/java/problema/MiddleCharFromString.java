package problema;

public class MiddleCharFromString {
    public static void main(String[] args) {
        String testString = "safa";
        displayMiddleChar(testString);
    }

    private static void displayMiddleChar(String testString) {
        int length = testString.length();
        System.out.println("String lenght = " + length);

        if (length % 2 !=0){
            int position = length/2;
            System.out.println(testString.charAt(position));

        }else{
            char c1= testString.charAt(length/2);
            char c2= testString.charAt(length/2-1);
            System.out.println(testString.valueOf(c1)+testString.valueOf(c2));

        }
    }
}
