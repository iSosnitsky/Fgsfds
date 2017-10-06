package Fgsfds.map;


public class MapElement<K, V> {
    private final K key;
    private final V value;

    public MapElement(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
}
