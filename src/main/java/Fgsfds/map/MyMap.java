package Fgsfds.map;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class MyMap<E> {
    private List<MapElement> map = new ArrayList<>();

    public void put(String key, E value) {
        if (map.stream().anyMatch(el -> key.equals(el.getKey()))) {
            map.replaceAll(el -> key.equals(el.getKey()) ? new MapElement<>(key, value) : el);
        } else {
            map.add(new MapElement<>(key, value));
        }
    }

    public E get(String key) throws NoSuchElementException {
        try {
            return (E)map.stream()
                    .filter(el -> key.equals(el.getKey()))
                    .findFirst()
                    .get()
                    .getValue();
        } catch (ClassCastException e) {
            return null;
        }

    }
}
