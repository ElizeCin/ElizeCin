package org.example.Lesson_12_exception;

import java.io.IOException;
import java.util.zip.ZipException;

public class Exception {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = 2 / 0;
        } catch (ArithmeticException e) {
                     n = 2 / 2;
        }
        try {
            exMethod();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(n);
        System.out.println("end");

    }
    public static  void exMethod() throws IOException {
        throw new IOException("Hello");

    }
}
