package com.develogical;

import java.util.*;

public class RecentlyUsedList {
    public List items = new ArrayList();

    public boolean isEmpty() {
        return items.isEmpty();

    }

    public void add(Object item) {
        if (items.contains(item)) {
            items.remove(item);
        }

        items.add(item);
    }

    public Object retrieve() {
        return items.get(items.size() -1);
    }
}
