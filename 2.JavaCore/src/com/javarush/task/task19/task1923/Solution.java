package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        while (fileReader.ready()) {
            String[] words;
            words = fileReader.readLine().split(" ");
            for (String word : words) {
                if (word.matches(".+[0-9].+"))
                    fileWriter.append(word + " ");
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
