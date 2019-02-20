package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int arr[] = new int[5];
        String sN;
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            sN = reader.readLine();
            arr[i] = Integer.parseInt(sN);
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
