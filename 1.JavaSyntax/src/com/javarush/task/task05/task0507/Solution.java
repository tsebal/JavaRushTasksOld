package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0, i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
                break;
            sum += number;
            i++;
        }
        System.out.println((float) sum/i);
    }
}

