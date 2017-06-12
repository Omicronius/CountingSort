package com.revotech.sorter.parser;

import java.util.Arrays;

public class ArrayParser {
    public int [] parseArrayFromString (String lineOfElements) {
        return Arrays.stream(lineOfElements.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
