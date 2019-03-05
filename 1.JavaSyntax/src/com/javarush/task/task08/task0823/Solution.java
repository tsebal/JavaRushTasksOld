package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char m[] = s.toCharArray();
        String spc = " ";
        if (m[0] != spc.charAt(0))
            m[0] = Character.toUpperCase(m[0]);

        for (int i = 0; i < m.length; i++) {
            if (m[i] == spc.charAt(0)) {
                if (m[i+1] != spc.charAt(0)) {
                    m[i+1] = Character.toUpperCase(m[i+1]);
                }
            }
        }
        for (int i = 0; i < m.length; ++i) {
            System.out.print(m[i]);
        }
    }
}