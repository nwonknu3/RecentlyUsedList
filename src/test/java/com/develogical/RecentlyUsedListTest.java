package com.develogical;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class RecentlyUsedListTest {


    @Test public void listIsEmpty() {

        RecentlyUsedList listTest = new RecentlyUsedList();

        assertTrue(listTest.isEmpty());
    }


    @Test public void shouldAddItemToList() {
        RecentlyUsedList list = new RecentlyUsedList<Object>();
        list.add(new Object());

        assertEquals(1, list.size());
    }



    @Test public void isEmptyShouldReturnFalseWhenAnItemIsInList() {
        RecentlyUsedList list = new RecentlyUsedList<Object>();
        list.add(new Object());

        assertFalse(list.isEmpty());
    }


    @Test public void shouldRetrieveItemAddedToList() {
        RecentlyUsedList list = new RecentlyUsedList<Integer>();

        int testItem = 42;

        list.add(testItem);

        assertEquals(testItem, list.getMostRecentItem());
    }


    @Test public void mostRecentItemShouldBeTheFirstInTheList() {
        RecentlyUsedList list = new RecentlyUsedList<Integer>();

        list.add(42);

        int testItem2 = 43;

        list.add(testItem2);

        assertEquals(testItem2, list.getMostRecentItem());
    }


    @Test public void duplicatesShouldNotBeAdded() {
        RecentlyUsedList list = new RecentlyUsedList<Integer>();

        list.add(42);
        list.add(43);
        list.add(44);
        list.add(43);

        assertEquals(3, list.size());
    }


    @Test public void duplicatesShouldBeMovedToStartOfList() {
        RecentlyUsedList list = new RecentlyUsedList<Integer>();

        list.add(42);
        list.add(43);
        list.add(44);
        list.add(43);

        assertEquals(43, list.getMostRecentItem());
    }

    @Test(expected = IndexOutOfBoundsException.class) public void shouldthrowIndexOutOfBoundsExceptionIfGettingFromAnEmptyList() {

        RecentlyUsedList listTest = new RecentlyUsedList();

        listTest.getMostRecentItem();
    }
}
