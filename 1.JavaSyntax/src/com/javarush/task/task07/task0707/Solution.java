package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Utki poleteli");
        list.add(1, "Otleteli utki");
        list.add(2, "Zavali utku");
        list.add(3, "Utka");
        list.add(4, "Vali utku");
        System.out.println(list.size());
        for (int i = 0; i < 5; i++)
            System.out.println(list.get(i));
    }
}
