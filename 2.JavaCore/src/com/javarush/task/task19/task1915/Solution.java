package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();

        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(outputStream);
        System.setOut(newPrintStream);

        testString.printSomething();
        String result = outputStream.toString();

        System.setOut(defaultPrintStream);
        fileWriter.write(result);
        fileWriter.close();
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

