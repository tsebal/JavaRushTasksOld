package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        RandomAccessFile wr = new RandomAccessFile(reader.readLine(), "rw");
        reader.close();
        if (args[0].equals("-c") && args.length == 4) {
            int max = 0;
            while (wr.getFilePointer() != wr.length()) {
                String fstr = wr.readLine();
                if (Integer.parseInt(fstr.substring(0, 8)) > max)
                    max = Integer.parseInt(fstr.substring(0, 8));
            }
            String smax = String.valueOf(max);

            while (smax.length() < 8) {
                smax = smax + " ";
            }
            while (args[1].length() < 30) {
                args[1] = args[1] + " ";
            }
            while (args[2].length() < 8) {
                args[2] = args[2] + " ";
            }
            while (args[3].length() < 4) {
                args[3] = args[3] + " ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(smax+args[1]+args[2]+args[3]);
            wr.seek(wr.length());
            wr.writeUTF(sb.toString());
            wr.close();
        }
    }
}