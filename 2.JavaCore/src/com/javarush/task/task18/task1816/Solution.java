package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader(args[0]);

        char a;
        int englishCount = 0;
        while (file.ready()) {
            a = (char) file.read();
            if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
                englishCount++;
        }

        System.out.println(englishCount);
        file.close();
    }
}
