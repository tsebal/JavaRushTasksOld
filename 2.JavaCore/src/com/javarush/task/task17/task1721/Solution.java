package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/



public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fF = reader.readLine();
        String sF = reader.readLine();
        reader.close();
        BufferedReader reader2 = new BufferedReader(new FileReader(fF));
        BufferedReader reader3 = new BufferedReader(new FileReader(sF));
        String str;
        while ((str = reader2.readLine()) != null){
            allLines.add(str);
        }
        while ((str = reader3.readLine()) != null){
            forRemoveLines.add(str);
        }
        reader2.close();
        reader3.close();
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {

        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            List<String> allLines2 = allLines;
            for (int i = 0; i < allLines2.size(); i++) {
                for (int j = 0; j < forRemoveLines.size(); j++) {
                    if (allLines2.get(i).equals(forRemoveLines.get(j)))
                        allLines.remove(i);
                }
            }
        }
        else if (!allLines.containsAll(forRemoveLines)) {
            for (int i = 0; i < allLines.size(); i++) {
                allLines.remove(i);
            }
            throw new CorruptedDataException();
        }
    }
}
