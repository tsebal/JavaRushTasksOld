package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ромарио");
        list.add("реликт");
        list.add("лимра");
        list.add("ломота");
        list.add("ромарио");
        list.add("тан");
        list.add("лира");
        list.add("лоза");
        list = fix(list);

        for (String x : list){
            System.out.println(x);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).contains("р")) && (!list.get(i).contains("л"))) {
                list.remove(i);
                i--;
            }
                else
                    if ((list.get(i).contains("л")) && (!list.get(i).contains("р"))) {
                        list.add(i, list.get(i));
                        i++;
                    }
        }
        return list;
    }
}