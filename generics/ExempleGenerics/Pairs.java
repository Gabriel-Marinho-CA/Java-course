package nelioAlves.course.generics.ExempleGenerics;

import java.util.*;

public class Pairs<K extends Number, V> {

    private final Set<Pair<K, V>> items = new HashSet<>();

    public void addToList(K key, V value) {

        if (key == null) return;

        Pair<K, V> newPair = new Pair<K, V>(key, value);


        if (items.contains(newPair)) {
            items.remove(newPair);
        }

        items.add(newPair);
    }

    public V getValue(K key) {
        if (key == null) return null;

        Optional<Pair<K, V>> OptionalPair = items
                .stream()
                .filter(pair -> key.equals(pair.getKey()))
                .findFirst();

        return OptionalPair.isPresent() ? OptionalPair.get().getValue() : null;
    }
}
