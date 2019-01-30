package bubbleSort;

public class BubbleSort {

    public int [] bubbleSort (int sort []){
        int aux;
        for (int i = 0; i<sort.length;i++){
            for (int j = 0; j<sort.length;j++){
                if (sort[i] < sort[j]){
                    aux = sort[i];
                    sort[i] = sort[j];
                    sort[j] = aux;
                }
            }
        }
        return sort;

    }



}
