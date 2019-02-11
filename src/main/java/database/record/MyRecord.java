package database.record;

import database.key.Key;
import database.key.MyKey;
import database.record.Record;

public class MyRecord implements Record {

    MyKey key;

    public MyRecord(MyKey key) {
        this.key = key;
    }

    @Override
    public Key getKey() {
        return key;
    }
}
