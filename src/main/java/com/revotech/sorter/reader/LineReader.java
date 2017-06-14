package com.revotech.sorter.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LineReader {
    public ArrayList<String> readAllLines(String pathToFile) {
        ArrayList<String> result = new ArrayList<>();
        try {
            Files.lines(Paths.get(pathToFile), StandardCharsets.UTF_8).forEach(result::add);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return result;
    }
}
