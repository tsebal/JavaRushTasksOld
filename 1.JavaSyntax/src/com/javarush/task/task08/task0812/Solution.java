package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int repeatCount = 1;
        int repeatMax = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i-1).equals(list.get(i)))
                repeatCount = 1;
            else {
                repeatCount++;
                if (repeatCount > repeatMax)
                    repeatMax = repeatCount;
            }
        }
        System.out.println(repeatMax);
    }
}