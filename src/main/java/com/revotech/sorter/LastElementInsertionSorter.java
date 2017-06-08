package com.revotech.sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LastElementInsertionSorter {
    private static Scanner scanner;
    private static int size;
    private static String lineOfElements;

    public static void insertionSort() {
        readInput();
        String[] elements = lineOfElements.split(" ");
        int[] unsortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            unsortedArray[i] = Integer.parseInt(elements[i]);
        }
        int unsortedElement = unsortedArray[size - 1];
        int i = size - 1;
        while (i > 0 && unsortedElement < unsortedArray[i - 1]) {
                unsortedArray[i] = unsortedArray[i - 1];
                printArray(unsortedArray);
                i--;
        }
        unsortedArray[i] = unsortedElement;
        printArray(unsortedArray);
    }

    private static void printArray(int[] arr) {
        String output = "";
        for (int element : arr) {
            output += element + " ";
        }
        output = output.trim() + "\n";
        System.out.print(output);
    }

    private static void readInput() {
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        size = Integer.parseInt(scanner.nextLine());
        lineOfElements = scanner.nextLine();
        scanner.close();
    }

    public static void main(String[] args) {
        insertionSort();
    }
}
