package problema;

import java.util.ArrayList;

public class Klargestelements {
    public static void main(String[] args) {

        int x [] = {1, 2, 3, 4, 5, 6, 7};
        int noOfMax = 3;

        for (int i=0;i<noOfMax;i++){
            int max = getMaxValue(x);
            System.out.println(max);
            x = removeElement(max,x);
        }

        int max = getMaxValue(x);
//        System.out.println(max);
        int [] nouaLista= removeElement(max,x);
        for(int value : nouaLista) {
            System.out.print(value);
        }

    }

    static int getMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int [] removeElement (int element, int[] oldarray) {

        int[] newArray = new int[oldarray.length - 1];
        int index = 0;

        for (int i = 0; i < oldarray.length; i++) {
            if (element != oldarray[i]) {
                newArray[index] = oldarray[i];
                index++;
            }
        }
        return newArray;


    }
}


