package DZ2.MyCollections;

import java.util.*;

public class MyHashSet<Element> {

    private HashMap<Element, Object> map;
    private static final Object OBJECT = new Object();

    public MyHashSet() {
        map = new HashMap<>();
    }

    public boolean add(Element e) {
        return map.put(e, OBJECT) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) == OBJECT;
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }
}
