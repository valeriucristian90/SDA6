package database.key;

public class MyKey implements Key {

    private final int key;

    public int getKey() {
        return key;
    }



    public MyKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Key key) {
        MyKey keyToCompareWith = (MyKey) key;
        return this.key == keyToCompareWith.getKey();
    }
}
