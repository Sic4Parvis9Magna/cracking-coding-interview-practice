package org.example.arrays_strings;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndStringsTask6Test {

    @Test
    void shouldRotateImage() throws URISyntaxException {
//        String file ="src/test/resources/fileTest.txt";

    }

    private byte[] getBytes(String fileName) {
        File file = new File(fileName);
        byte[] bytes = new byte[(int) file.length()];
        try(FileInputStream fis = new FileInputStream(file)) {
            int read = fis.read(bytes);
            if (read != -1) {
                return bytes;
            }
            throw new RuntimeException("Failed to read file!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}