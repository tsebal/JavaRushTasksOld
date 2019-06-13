package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        RandomAccessFile r1 = new RandomAccessFile(reader.readLine(), "rw");
        RandomAccessFile r2 = new RandomAccessFile(reader.readLine(), "r");
        reader.close();

        byte[] b1 = new byte[(int) r1.length()];
        byte[] b2 = new byte[(int) r2.length()];

        r1.read(b1);
        r2.read(b2);

        r1.seek(0);
        r1.write(b2);
        r1.write(b1);

        r1.close();
        r2.close();
    }
}
