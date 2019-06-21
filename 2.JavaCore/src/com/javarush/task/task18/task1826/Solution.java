package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 3) {
            FileInputStream in = new FileInputStream(args[1]);
            FileOutputStream out = new FileOutputStream(args[2]);
            if (args[0].equals("-e")) {
                while (in.available() > 0) {
                    int a = in.read();
                    out.write(a * 2 - 4);
                }
            }
            else
                if (args[0].equals("-d")) {
                    while (in.available() > 0) {
                        int a = in.read();
                        out.write((a + 4) / 2);
                    }
                }
            in.close();
            out.close();
        }
    }
}