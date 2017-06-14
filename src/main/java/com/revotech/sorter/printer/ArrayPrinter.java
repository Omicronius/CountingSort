package com.revotech.sorter.printer;

import java.util.List;

public class ArrayPrinter {
    public void printArray(String[] array, List<String> originalOrder) {
        StringBuilder result = new StringBuilder();
        String element;

        for (String str : array) {
            element = (originalOrder.indexOf(str) > 9) ? str.split(" ")[1] + " " : "- ";
            result.append(element);
        }

        System.out.println(result.toString());
    }
}
