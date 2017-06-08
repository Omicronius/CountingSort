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
        StringBuilder sortingReport = new StringBuilder("");
        int[] unsortedArray = Arrays.stream(lineOfElements.split(" ")).mapToInt(Integer::parseInt).toArray();
        int unsortedElement = unsortedArray[arraySize - 1];
        int i = arraySize - 1;
        while (i > 0 && unsortedElement < unsortedArray[i - 1]) {
            unsortedArray[i] = unsortedArray[i - 1];
            sortingReport.append(arrayToString(unsortedArray));
            i--;
        }
        unsortedArray[i] = unsortedElement;
        sortingReport.append(arrayToString(unsortedArray));
        System.out.println(sortingReport);
    }

    private static StringBuilder arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("");
        for (int element : arr) {
            result.append(element + " ");
        }
        result.append("\n");
        return result;
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
}
