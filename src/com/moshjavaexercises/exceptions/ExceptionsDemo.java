package com.moshjavaexercises.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try (var reader = new FileReader("file.txt")) {
            System.out.println("Reading file");
            var value = reader.read();
            System.out.println(value);
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("Failed to read the file");
        }
    }
}
