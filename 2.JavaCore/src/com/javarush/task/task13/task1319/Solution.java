package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileToWrite = reader.readLine();
        FileWriter fileWriter = new FileWriter(fileToWrite, false);
        String input = "";
        while (!input.equals("exit")) {
            input = reader.readLine();
            fileWriter.write(input);
            fileWriter.write(System.lineSeparator());
        }
        fileWriter.close();
        reader.close();
    }
}