package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        if (input > 150)
            return;

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {

        if (n < 0)
            return "0";
        else
            if (n == 0)
                return "1";
        else {
            BigInteger rez = BigInteger.valueOf(1);
            for (long i = 1; i <= n; i++) {
                rez = rez.multiply(BigInteger.valueOf(i));
            }
            return String.valueOf(rez);
        }
    }
}
