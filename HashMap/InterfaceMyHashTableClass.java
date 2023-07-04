package MyHashTable;
public interface InterfaceMyHashTableClass<Integer, String> {
    void put(int key, String value);
    String get(int key);
    void remove(int key);
    int size();

}