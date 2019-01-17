package problema;

public class LengthString {
    public static void main(String[] args) {

        String testString = "Mama are mere";
        lungimeString(testString);

    }

    public static void lungimeString (String str){
        int count = 1;
        for (int i=0;i<str.length();i++){
            if((str.charAt(i) == ' ')){
                count++;
            }
        }
        System.out.println(count);
    }


}


