package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        FileOutputStream fOS = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (fIS.available() > 0) {
            list.add(fIS.read());
        }
        for (int i = list.size()-1; i >= 0; i--) {
            fOS.write(list.get(i));
        }

        reader.close();
        fIS.close();
        fOS.close();
    }
}