package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int counter = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String text = "";
        while (fileReader.ready()) {
            text += fileReader.readLine();
        }
        fileReader.close();

        String replacedString = text.replaceAll("\\p{P}", " ").toLowerCase();
        replacedString = replacedString.replaceAll("\\s", " ");

        String splitString[] = replacedString.split(" ");
        for (String x : splitString) {
            if (x.equals("world"))
                counter++;
        }

        System.out.println(counter);
    }
}
