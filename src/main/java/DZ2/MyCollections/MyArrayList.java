package DZ2.MyCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList<Elements> {
    private static final int DEFAULT_SIZE = 10;
    private static final Object[] DEFAULT_EMPTY_ARRAY = {};

    private transient Object[] defaultArray;
    private int size;

    public MyArrayList() {
        this.defaultArray = DEFAULT_EMPTY_ARRAY;
    }

    private Object[] grow(int personSize) {
        int oldSize = defaultArray.length;
        if (oldSize > 0 || defaultArray != DEFAULT_EMPTY_ARRAY) {
            int newSize = oldSize + personSize;
            return defaultArray = Arrays.copyOf(defaultArray, newSize);
        } else {
            return defaultArray = new Object[Math.max(DEFAULT_SIZE, personSize)];
        }
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    @SuppressWarnings("unchecked")
    private Elements defaultArray(int index) {
        return (Elements) defaultArray[index];
    }

    public Elements get(int index) {
        Objects.checkIndex(index, size);
        return defaultArray(index);
    }

    public boolean addAll(Collection<? extends Elements> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] defaultArray;
        final int s;
        if (numNew > (defaultArray = this.defaultArray).length - (s = size))
            defaultArray = grow(s + numNew);
        System.arraycopy(a, 0, defaultArray, s, numNew);
        size = s + numNew;
        return true;
    }

    public boolean remove(Object o) {
        final Object[] es = defaultArray;
        final int size = this.size;
        int i = 0;
        found: {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        fastRemove(es, i);
        return true;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    private void add(Elements e, Object[] defaultArray, int s) {
        if (s == defaultArray.length)
            defaultArray = grow();
        defaultArray[s] = e;
        size = s + 1;
    }

    public boolean add(Elements e) {
        add(e, defaultArray, size);
        return true;
    }

    public int length() {
        return size;
    }

}
