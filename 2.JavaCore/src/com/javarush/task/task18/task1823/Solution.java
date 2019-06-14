package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            if ((str = reader.readLine()).equals("exit"))
                break;
            Thread thread = new ReadThread(str);
            thread.start();
            thread.join();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName));
                int nextByte;
                int[] bytesCount = new int[256];
                while ((nextByte = in.read()) != -1) {
                    if (nextByte < -1) throw new RuntimeException();
                    bytesCount[nextByte]++;
                }
                int maxI = 0;
                for (int i = 1; i < bytesCount.length; i++)
                    if (bytesCount[i] > bytesCount[maxI])
                        maxI = i;
                synchronized (Solution.class) {
                    resultMap.put(fileName, maxI);
                }
                in.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
