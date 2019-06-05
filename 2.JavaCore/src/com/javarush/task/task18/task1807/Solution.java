package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        int comma = 0;
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (data == 44)
                comma++;
        }
        reader.close();
        fIS.close();

        System.out.println(comma);
    }
}
