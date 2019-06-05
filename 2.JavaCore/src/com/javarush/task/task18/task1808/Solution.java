package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        FileOutputStream fOS1 = new FileOutputStream(reader.readLine());
        FileOutputStream fOS2 = new FileOutputStream(reader.readLine());
        int totalCntByte = fIS.available();
        int half = 0;

        if (totalCntByte % 2 == 0)
            half = totalCntByte / 2;
        else
            half = totalCntByte / 2 + 1;

        for (int i = 0; i < totalCntByte; i++) {
            if (i < half)
                fOS1.write(fIS.read());
            else
                fOS2.write(fIS.read());
        }

        reader.close();
        fIS.close();
        fOS1.close();
        fOS2.close();
    }
}
