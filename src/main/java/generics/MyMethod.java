package generics;

import java.util.List;

public class MyMethod <T> {
    T field1;
    T field2;

    public MyMethod(T field1, T field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return field1 +"<-->"
                 + field2 +" "
                ;
    }
}
