package com.develogical;


import java.util.*;

public class RecentlyUsedList<E> {
    private Stack<E> items = new Stack<E>();

    public boolean isEmpty() {
        return items.isEmpty();

    }

    public void add(E item) {
        items.remove(item);
        items.add(item);
    }

    public E getMostRecentItem() throws IndexOutOfBoundsException {
        if (items.empty()) {
            throw new IndexOutOfBoundsException();
        }
        return items.pop();
    }

    public int size(){
        return items.size();

    }
}
