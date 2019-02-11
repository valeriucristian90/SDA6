package generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public <T> List<T> arrayToList(T[] t) {
        List<T> a = new ArrayList<>();
        for (T value : t) {
            a.add(value);
        }
        return a;
    }
}
