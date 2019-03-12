package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int [] a = {5, 4, 3, 2, 1};
        int [] b = {2, 1};
        int [] c = {4, 3, 2, 1};
        int [] d = {7, 6, 5, 4, 3, 2, 1};
        int [] e = {};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array: list ) {
            for (int x: array) {
                System.out.println(x);
            }
        }
    }
}
