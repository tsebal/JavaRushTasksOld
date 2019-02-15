package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int x;
        int N = Integer.parseInt(reader.readLine());

        if (N <= 0) return;

        maximum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N-1; i++) {
            x = Integer.parseInt(reader.readLine());
            if (x > maximum) {
                maximum = x;
            }
        }

        System.out.println(maximum);
    }
}
