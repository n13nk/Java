package MyHashTable;
public class MyHashTableClass implements InterfaceMyHashTableClass<Integer, String> {
    private int maxSize;
    private int currentSize;
    private Node[] list;
    private class Node {
        private Integer key;
        private String value;
        private Node nextNode;
        Node(Integer key, String value) {
            this.key = key;
            this.value = value;
            this.nextNode = null;
        }
    }
    MyHashTableClass(int maxSize) {
        this.maxSize = maxSize;
        this.list = new Node[maxSize];
    }
    @Override
    public void put(int key, String value) {
        int hashKey = myHashCode(key, maxSize);
        if (list[hashKey] == null) {
            list[hashKey] = new Node(key, value);
        } else {
            if (list[hashKey].key.equals(key)) {
                list[hashKey].value = value;
                currentSize -= 1;
            } else {
                Node node = list[hashKey];
                while (node.nextNode != null) {
                    node = node.nextNode;
                }
                node.nextNode = new Node(key, value);
            }
        }
        this.currentSize += 1;
        if (currentSize == maxSize * 0.75) {
            resize(maxSize * 2);
        }
    }

    @Override
    public String get(int key) {
        int hashKey = myHashCode(key, maxSize);
        if (list[hashKey].nextNode == null) {
            return list[hashKey].value;
        } else {
            //String result = "";
            Node nod = list[hashKey];
            while (nod.nextNode != null) {
                if (nod.key.equals(key)) {
                    //result += (nod.value + "/n");
                    return nod.value;
                }
                nod = nod.nextNode;
            }
            //return result;
            return null;
            }
        }

    @Override
    public void remove(int key) {
        int hashKey = myHashCode(key, maxSize);
        if (list[hashKey].nextNode == null) {
            list[hashKey] = null;
            this.currentSize -= 1;
        } else {
            Node nod = list[hashKey];
            while (nod.nextNode != null) {
                if (nod.key.equals(key)) {
                    nod = nod.nextNode;
                    this.currentSize -= 1;
                }
                list[hashKey] = list[hashKey].nextNode;
            }
        }
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    private int myHashCode(int key, int size) {
        String finalHash = "";
        String keyString = String.valueOf(key);
        String tempHash;
        for (int i = 0; i < keyString.length(); i++) {
            tempHash = String.valueOf(Integer.valueOf(keyString.charAt(i)));
            finalHash += tempHash;
        }
        return Integer.parseInt(finalHash) % size;
    }
    private void resize(int size) {
        Node[] newList = new Node[size];
        for (int i = 0; i < list.length; i++)
            if (list[i] != null) {
                int key  = list[i].key;
                newList[myHashCode(key, maxSize * 2)] = list[i];
            }
        list = newList;
        this.maxSize = size;
    }
}