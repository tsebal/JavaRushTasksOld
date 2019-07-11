package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> sList = new ArrayList<>();
        while (file.ready()) {
            stringBuilder = stringBuilder.append(file.readLine());
        }
        file.close();

        String t = args[0];
        String s = stringBuilder.toString().replaceAll("\r\n", "");
        ArrayList<Pair> list = new ArrayList<>();
        String open = "<".concat(t);
        String closing = "</".concat(t);
        int len = t.length();
        int index1 = 0;

        while ((index1 != -1) && (index1 < s.length())) {
            index1 = s.indexOf(open, index1);
            int index2 = s.indexOf(closing, index1 + len);
            int k = index1 + len;
            if (index2 != -1) {
                while (s.substring(k, index2).contains(open)) {
                    k = index2 + len;
                    index2 = s.indexOf(closing, k);
                }
            }
            if (index1 != -1 && index2 != -1) {
                list.add(new Pair(index1, index2));
                index1 += len;
            }
        }

        for (Pair pair : list) {
            String str = s.substring(pair.getA(), pair.getB() + len + 3);
            sList.add(str);
        }

        for (String s1 : sList) {
            System.out.println(s1);
        }
    }

    public static class Pair {
        private int a;
        private int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}
