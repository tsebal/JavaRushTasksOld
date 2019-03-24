package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        int a=0;
        Integer b=0;
        Solution sol = new Solution();
        sol.print(a);
        sol.print(b);
    }

    public static void print(int x) {
        System.out.println(x);
    }
    public static void print(Integer x) {
        System.out.println(x);
    }
}
