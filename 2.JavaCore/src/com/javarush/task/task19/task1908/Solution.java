package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        String text = "";
        while (fileReader.ready()) {
            text += (char)fileReader.read();
        }
        fileReader.close();

        String replacedString = text.replaceAll("\\p{P}", " ");
        replacedString=replacedString.replaceAll("\\s", " ");
        text = "";

        String splitString[] = replacedString.split(" ");
        for (String x : splitString) {
            if (test(x))
                text += x + " ";
        }
        fileWriter.write(text);
        fileWriter.close();
    }

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
