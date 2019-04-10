package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = Files.readAllLines(Paths.get(reader.readLine()), StandardCharsets.UTF_8);
        for(String line: lines){
            if (Integer.parseInt(line) % 2 == 0)
                list.add(Integer.parseInt(line));
        }

        Collections.sort(list);

        for (int ln : list) {
            System.out.println(ln);
        }
    }
}