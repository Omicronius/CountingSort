package com.revotech.sorter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSorterTest {
    private static LastElementInsertionSorter sorter;

    @BeforeClass
    public static void setUp() throws Exception {
        sorter = new LastElementInsertionSorter();
    }

    @Test
    public void sort() throws Exception {
        int [] unsorted = {2, 4, 6, 8, 3};
        int [] sorted = {2, 3, 4, 6, 8};
        Assert.assertTrue(Arrays.equals(sorter.sort(unsorted), sorted));
    }

    @Test
    public void firstElementInsertion() throws Exception {
        int [] unsorted = {2, 4, 6, 8, 1};
        int [] sorted = {1, 2, 4, 6, 8};
        Assert.assertTrue(Arrays.equals(sorter.sort(unsorted), sorted));
    }
}