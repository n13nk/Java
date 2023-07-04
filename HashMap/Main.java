package MyHashTable;
public class Main {
    public static void main(String[] args) {
        MyHashTableClass table = new MyHashTableClass(4);
        table.put(12, "12");
        table.put(12, "4124");
        table.put(14, "123124");
        table.put(15, "123124");
        table.put(16, "123124");
        table.put(17, "123124");
        System.out.println(table.size());
        table.remove(14);
        System.out.println(table.get(12));

    }
}
