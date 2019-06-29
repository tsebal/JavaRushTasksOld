package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(outputStream);
        System.setOut(newPrintStream);

        testString.printSomething();
        String result = outputStream.toString();
        String str[] = result.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        int c = 0;
        if (str[1].equals("+"))
            c = a + b;
        else
            if (str[1].equals("-"))
                c = a - b;
        else
            if (str[1].equals("*"))
                c = a * b;
        result = result.concat(String.valueOf(c));

        System.setOut(defaultPrintStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

