package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultStream = new PrintStream(System.out);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newConsoleStream = new PrintStream(outputStream);
        System.setOut(newConsoleStream);
        testString.printSomething();
        System.setOut(defaultStream);
        String[] byteArray = outputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++){
            System.out.println(byteArray[i]);
            if (i % 2 != 0)
                System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
