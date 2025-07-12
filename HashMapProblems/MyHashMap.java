import java.util.*;

public class MyHashMap<K, V> {
    static class Entry<K, V> {
        K key; V value;
        Entry(K k, V v) { key = k; value = v; }
    }

    private final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    public MyHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
            table[i] = new LinkedList<>();
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int idx = hash(key);
        for (Entry<K, V> e : table[idx]) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }
        table[idx].add(new Entry<>(key, value));
    }

    public V get(K key) {
        for (Entry<K, V> e : table[hash(key)]) {
            if (e.key.equals(key)) return e.value;
        }
        return null;
    }

    public void remove(K key) {
        table[hash(key)].removeIf(e -> e.key.equals(key));
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.get("two")); // 2
        map.remove("two");
        System.out.println(map.get("two")); // null
    }
}
