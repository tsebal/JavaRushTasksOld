package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nAge;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            nAge = Integer.parseInt(reader.readLine());
            if ((nAge % 3 == 0) && (nAge % 2 == 0)) {
                list1.add(nAge);
                list2.add(nAge);
            }
            else
                if (nAge%3==0) list1.add(nAge);
                    else
                        if (nAge%2==0) list2.add(nAge);
                            else
                                list3.add(nAge);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
