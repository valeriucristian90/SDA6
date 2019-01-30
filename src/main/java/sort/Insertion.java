package sort;

public class Insertion {

    public void insertionSort(int sort[]) {
        int j, aux;
        for (int i = 1; i < sort.length; i++) {
            aux = sort[i];
            j = i - 1;
            while (j >= 0 && sort[j] > aux) {
                sort[j + 1] = sort[j];
                j = j -1;
            }
            sort[j + 1] = aux;
        }
    }
}
