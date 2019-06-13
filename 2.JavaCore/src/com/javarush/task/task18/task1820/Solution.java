package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String str;
        String[] strMass;
        while ((str = fileReader.readLine()) != null) {
            strMass = str.split(" ");
            for (String strMas : strMass) {
                numbers.add((int) Math.round(Double.parseDouble(strMas)));
            }
        }

        String num = "";
        for (int a : numbers)
            num = num + a + " ";
        fileWriter.write(num);

        fileReader.close();
        fileWriter.close();
    }
}
