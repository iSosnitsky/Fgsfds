package Fgsfds.map;


final class MapElement<K, V> {
    private final K key;
    private final V value;

    MapElement(K key, V value) {
        this.key = key;
        this.value = value;
    }

    V getValue() {
        return value;
    }

    K getKey() {
        return key;
    }
}
