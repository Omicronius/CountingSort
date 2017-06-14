package com.revotech.sorter.sorter;

import java.util.Arrays;

public class CountingSorter {
    private final String ELEMENTS_DELIMITER = "-";

    public String[] sort(String[] unsortedArray) {
        String[] sortedArray = new String[unsortedArray.length];
        int max = Arrays.stream(unsortedArray).mapToInt((o) -> Integer.parseInt(o.split(" ")[0])).reduce(Integer::max).orElse(0);
        String[] countingArray = new String[max + 1];
        Arrays.fill(countingArray, "");

        for (String elem : unsortedArray) {
            countingArray[Integer.parseInt(elem.split(" ")[0])] += elem + ELEMENTS_DELIMITER;
        }

        int index = 0;
        for (String str : countingArray) {
            for (String innerStr : str.split(ELEMENTS_DELIMITER)) {
                sortedArray[index++] = innerStr;
            }
        }
        return sortedArray;
    }
}
