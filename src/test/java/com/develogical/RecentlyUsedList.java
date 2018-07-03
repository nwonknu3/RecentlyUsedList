package com.develogical;

import java.util.*;

public class RecentlyUsedList<E> {
    private List<E> items = new ArrayList<E>();

    public boolean isEmpty() {
        return items.isEmpty();

    }

    public void add(E item) {
        if (items.contains(item)) {
            items.remove(item);
        }

        items.add(item);
    }

    public E getMostRecentItem() {
        return items.get(items.size() -1);
    }

    public int size(){
        return items.size();

    }
}
