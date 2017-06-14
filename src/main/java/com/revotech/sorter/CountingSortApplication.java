package com.revotech.sorter;

import com.revotech.sorter.printer.ArrayPrinter;
import com.revotech.sorter.reader.LineReader;
import com.revotech.sorter.sorter.CountingSorter;

import java.util.List;

public class CountingSortApplication {
    private static final String PATH_TO_FILE = "input.txt";

    public static void main(String[] args) {
        LineReader reader = new LineReader();
        CountingSorter sorter = new CountingSorter();
        ArrayPrinter printer = new ArrayPrinter();

        List<String> elements = reader.readAllLines(PATH_TO_FILE);
        String [] sortedArray = sorter.sort(elements.toArray(new String[0]));
        printer.printArray(sortedArray, elements);
    }
}
