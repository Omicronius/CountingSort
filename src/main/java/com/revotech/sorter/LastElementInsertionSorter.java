package com.revotech.sorter;

public class LastElementInsertionSorter {
    public int[] sort(int[] arr) {
        boolean inserted = false;
        int elem = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (!inserted) {
                if (arr[i - 1] > elem) {
                    arr[i] = arr[i - 1];
                } else {
                    arr[i] = elem;
                    inserted = true;
                }
            }
        }
        if (!inserted) {
            arr[0] = elem;
        }
        return arr;
    }
}
