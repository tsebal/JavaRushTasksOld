package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int maxPeopleEven = 0;
        int maxPeopleOdd = 0;
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0)
                maxPeopleEven += house[i];
            else
                maxPeopleOdd += house[i];
        }
        if (maxPeopleEven > maxPeopleOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
