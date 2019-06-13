package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);

        char a;
        int count = 0;
        int count2 = 0;
        while (file.ready()) {
            a = (char) file.read();
            if (a == ' ')
                count2++;
            count++;
        }

        System.out.println(String.format("%.2f", ((float) count2 / count) * 100));
        file.close();
    }
}
