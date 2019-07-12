package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        String[] symbols;
        String line;
        while ((line = file.readLine()) != null) {
            symbols = line.split(" ");
            String name = "";
            for (int i = 0; i < symbols.length - 3; i++) {
                if (i == symbols.length - 4)
                    name = name + symbols[i];
                else
                    name = name + symbols[i] + " ";
            }
            int year = Integer.parseInt(symbols[symbols.length - 1]);
            int month = Integer.parseInt(symbols[symbols.length - 2])-1;
            int day = Integer.parseInt(symbols[symbols.length - 3]);
            Date birthDay = new GregorianCalendar(year, month, day).getTime();
            PEOPLE.add(new Person(name, birthDay));
        }
        file.close();
    }
}
