package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        reader.close();
        int maxByte = 0;
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (data >= maxByte)
                maxByte = data;
        }
        System.out.println(maxByte);
        fIS.close();
    }
}
