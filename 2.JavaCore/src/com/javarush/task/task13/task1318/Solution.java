package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream fis = new FileInputStream(fileName);

        while (fis.available() > 0) {
            int data = fis.read();
            System.out.println((char) data);
        }

        fis.close();
        br.close();
    }
}
