package com.revotech.sorter.sorter;

import com.revotech.sorter.reporter.Reporter;

public class InsertionSorter {

    public static void sortArray(int [] unsortedArray) {
        int outerIndex = 1;
        int innerIndex;
        while (outerIndex < unsortedArray.length) {
            innerIndex = outerIndex;
            while (innerIndex > 0 && unsortedArray[innerIndex] < unsortedArray[innerIndex - 1]) {
                int temp = unsortedArray[innerIndex];
                unsortedArray[innerIndex] = unsortedArray[innerIndex - 1];
                unsortedArray[innerIndex - 1] = temp;
                innerIndex--;
            }
            outerIndex++;
            Reporter.printArray(unsortedArray);
        }
    }
}
