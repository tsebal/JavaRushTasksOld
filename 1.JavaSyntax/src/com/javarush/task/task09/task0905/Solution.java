package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int count = 0;
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        for (StackTraceElement element1 : element) {
            if (!element1.toString().isEmpty()) count++;
        }
        System.out.println(count);
        return  count;
    }
}