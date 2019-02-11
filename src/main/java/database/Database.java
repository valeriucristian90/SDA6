package database;

import database.key.Key;
import database.record.Record;

public class Database {

    private Record[] data;
    private int lastEmptyIndex;

    public Database() {
        lastEmptyIndex = 0;
        data = new Record[100];
    }

    public boolean insert(Record r) {
        if (lastEmptyIndex < 100) {
            data[lastEmptyIndex] = r;
            lastEmptyIndex++;
            System.out.println("Succesfully insert record " + r);
            return true;
        }
        System.out.println("Unable to insert record " + r);
        return false;
    }

    public Record find(Key keyValue) {
        for (Record x : data) {
            if (x.getKey().equals(keyValue)) {
                return x;
            }
        }
        return null;
    }
}
