package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        String sl = list.get(0);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).length() < sl.length())
                sl = list.get(i);
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == sl.length())
                System.out.println(list.get(i));
        }
    }
}
