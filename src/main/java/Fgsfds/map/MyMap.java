package Fgsfds.map;

import java.util.ArrayList;
import java.util.List;


public class MyMap<K, V> {
    private final List<MapElement> map = new ArrayList<>();

    public void put(K key, V value) {
        if (map.stream().anyMatch(el -> key.equals(el.getKey()))) {
            map.replaceAll(el -> key.equals(el.getKey()) ? new MapElement<>(key, value) : el);
        } else {
            map.add(new MapElement<>(key, value));
        }
    }

    public V get(K key) {

        MapElement mapElement = map.stream()
                    .filter(el -> key.equals(el.getKey()))
                    .findFirst()
                .orElseThrow(NullPointerException::new);
        return (V) mapElement.getValue();

    }
}
