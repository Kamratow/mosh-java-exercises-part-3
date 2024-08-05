package com.moshjavaexercises.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try (var reader = new FileReader("file.txt")) {
            System.out.println("Reading file");
            var value = reader.read();
            System.out.println(value);
        } catch (IOException e) {
            System.out.println("Failed to read the file");
        }
    }
}
