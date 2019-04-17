package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0)
            throw new Exception();
        System.out.println(gcd(a, b));
    }

    public static int gcd (int a, int b) {
        int nod = 0;
        while(a != 0 && b != 0){
            if (a > b)
                a = a % b;
            else
                b = b % a;
            nod = (a + b);
        }
        return nod;
    }
}

