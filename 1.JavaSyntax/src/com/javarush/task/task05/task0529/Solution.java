package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int sum = 0;

        while (!str.equals("сумма")) {
            str = br.readLine();
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);
    }
}
