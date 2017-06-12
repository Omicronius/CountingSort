package com.revotech.sorter.reporter;

public class Reporter {
    public static void printArray(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int element : array) {
            result.append(element).append(" ");
        }
        System.out.println(result);
    }
}
