package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = fileReader.readLine()) != null) {
            String[] strMas = line.split(" ");
            for (String x : strMas) {
                if (x.length() > 6)
                    sb.append(x + ",");
            }
        }
        sb.delete(sb.length()-1, sb.length());
        fileWriter.write(sb.toString());
        fileReader.close();
        fileWriter.close();
    }
}
