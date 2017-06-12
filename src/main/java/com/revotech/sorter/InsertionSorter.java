package com.revotech.sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorter {
    private static final String PATH_TO_FILE = "input.txt";

    public static void insertionSort() {
        int arraySize = 0;
        String lineOfElements = "";

        try (Scanner scanner = new Scanner(new File(PATH_TO_FILE))) {
            arraySize = Integer.parseInt(scanner.nextLine());
            lineOfElements = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] unsortedArray = Arrays.stream(lineOfElements.split(" ")).mapToInt(Integer::parseInt).toArray();
        int outerIndex = 1;
        int innerIndex;
        while (outerIndex < arraySize) {
            innerIndex = outerIndex;
            while (innerIndex > 0 && unsortedArray[innerIndex] < unsortedArray[innerIndex - 1]) {
                int temp = unsortedArray[innerIndex];
                unsortedArray[innerIndex] = unsortedArray[innerIndex - 1];
                unsortedArray[innerIndex - 1] = temp;
                innerIndex--;
            }
            outerIndex++;
            System.out.println(arrayToString(unsortedArray));
        }
    }

    private static StringBuilder arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int element : arr) {
            result.append(element).append(" ");
        }
        return result;
    }
}
