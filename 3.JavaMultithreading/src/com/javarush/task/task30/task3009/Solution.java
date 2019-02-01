package com.javarush.task.task30.task3009;

import java.util.HashSet;
import java.util.Set;

/* 
Палиндром?
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        Set<Integer> set = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = 2; i < 37; i++) {
                sb.append(dec2m(Integer.parseInt(number), i));
                sb.reverse();
                if (String.valueOf(dec2m(Integer.parseInt(number), i)).equals(sb.toString()))
                    set.add(i);
                sb.delete(0, sb.length());
            }
            return set;
        }
        catch (NumberFormatException e) {

        }
        return set;
    }

    static String dec2m(int N, int m) {
        String s = "";
        for (int n = N; n > 0; n /= m) {
            int r = n % m;
            s = r < 10 ? r + s : (char) ('A' - 10 + r) + s;
        }
        return s;
    }
}