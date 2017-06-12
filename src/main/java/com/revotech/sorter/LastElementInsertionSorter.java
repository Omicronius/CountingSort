package com.revotech.sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LastElementInsertionSorter {
    private static Scanner scanner;
    private static String pathToFile = "input.txt";
    private static int arraySize;
    private static String lineOfElements;

    public static void insertionSort() {
        initialization();
        StringBuilder sortingReport = new StringBuilder();
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

    private static void initialization() {
        try {
            scanner = new Scanner(new File(pathToFile));
            arraySize = Integer.parseInt(scanner.nextLine());
            lineOfElements = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
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
