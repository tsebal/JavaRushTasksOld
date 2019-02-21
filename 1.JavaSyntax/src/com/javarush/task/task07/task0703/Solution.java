package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] array = new String[10];
        int[] array2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
            array2[i] = array[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}