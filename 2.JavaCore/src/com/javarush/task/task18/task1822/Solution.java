package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        String str;
        while ((str = fileReader.readLine()) != null) {
            if (str.startsWith(args[0] + ' ')) {
                System.out.println(str);
                break;
            }
        }
        fileReader.close();
    }
}
