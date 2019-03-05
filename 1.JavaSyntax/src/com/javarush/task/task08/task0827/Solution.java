package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date yearStartDate = new Date();

        yearStartDate.setYear(currentDate.getYear());
        yearStartDate.setMonth(0);
        yearStartDate.setDate(1);

        long msTimeDistance = currentDate.getTime() - yearStartDate.getTime();
        long msDay = 24*60*60*1000;

        int dayCount = (int)(msTimeDistance/msDay);
        if (dayCount % 2 != 0)
            return true;
        else
            return false;
    }
}