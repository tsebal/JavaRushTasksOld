package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sum = br.readLine();
        for (int i = 0; i < sum.length(); i++) {
            int num = Integer.parseInt(Character.toString(sum.charAt(i)));
            if (num % 2 == 0) even += 1;
                    else odd += 1;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
