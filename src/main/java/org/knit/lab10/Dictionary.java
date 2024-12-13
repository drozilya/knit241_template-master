package org.knit.lab10;
import java.util.HashMap;
import java.util.Map;

public class Dictionary<K, V> {
    private final Map<K, V> map;

    public Dictionary() {
        this.map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
    }

}