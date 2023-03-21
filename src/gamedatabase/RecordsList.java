/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamedatabase;
import java.util.ArrayList;
/**
 *
 * @author Max
 */

public class RecordsList {
    
    private ArrayList<Record> records;

    public RecordsList() {
        records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public void removeRecord(Record record) {
        records.remove(record);
    }

    public Record getRecord(int index) {
        return records.get(index);
    }

    public int getSize() {
        return records.size();
    }
}
