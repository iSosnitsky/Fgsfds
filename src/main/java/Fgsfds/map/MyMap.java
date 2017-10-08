package Fgsfds.map;

import java.util.ArrayList;
import java.util.List;


public class MyMap<K, V> {
    private final List<MapElement> mapElements = new ArrayList<>();

    public void put(K key, V value) {
        if (mapElements.stream().anyMatch(el -> key.equals(el.getKey()))) {
            mapElements.replaceAll(el -> key.equals(el.getKey()) ? new MapElement<>(key, value) : el);
        } else {
            mapElements.add(new MapElement<>(key, value));
        }
    }

    public V get(K key) {

        MapElement mapElement = mapElements.stream()
                    .filter(el -> key.equals(el.getKey()))
                    .findFirst()
                .orElseThrow(NullPointerException::new);
        //HashMap for an instance, throws NullPointerException if there's no element with such key.
        return (V) mapElement.getValue();

    }
}
