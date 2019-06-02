package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        reader.close();
        int minByte = 1000;
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (data <= minByte)
                minByte = data;
        }
        System.out.println(minByte);
        fIS.close();
    }
}
