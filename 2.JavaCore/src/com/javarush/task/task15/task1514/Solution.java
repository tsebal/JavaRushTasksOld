package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(22.2, "roma");
        labels.put(23.2, "2roma");
        labels.put(24.2, "3roma");
        labels.put(25.2, "4roma");
        labels.put(26.2, "5roma");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
