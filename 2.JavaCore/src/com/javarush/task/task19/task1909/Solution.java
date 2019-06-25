package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();

        String text = "";
        while (fileReader.ready()) {
            text += (char)fileReader.read();
        }
        fileReader.close();

        fileWriter.write(text.replaceAll("\\.", "!"));
        fileWriter.close();
    }
}
