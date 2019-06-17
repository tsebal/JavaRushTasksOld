package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        FileReader fileReader = null;
        while ((fileName = reader.readLine()) != null) {
            try {
                fileReader = new FileReader(fileName);
            }
            catch (FileNotFoundException e) {
                System.out.println(fileName);
                reader.close();
                fileReader.close();
                break;
            }
        }
    }
}
