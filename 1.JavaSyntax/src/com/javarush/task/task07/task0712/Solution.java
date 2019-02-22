package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minStr = 0;
        int maxStr = 0;

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
            if (i == 0)
                minStr = list.get(i).length();
            if (list.get(i).length() < minStr)
                minStr = list.get(i).length();
            if (list.get(i).length() >= maxStr)
                maxStr = list.get(i).length();
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minStr || list.get(i).length() == maxStr) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
