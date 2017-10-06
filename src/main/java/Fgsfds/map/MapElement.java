package Fgsfds.map;


public class MapElement<E> {
    private String key;
    private E value;
    public MapElement(String key, E value) {
        this.key = key;
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
}
