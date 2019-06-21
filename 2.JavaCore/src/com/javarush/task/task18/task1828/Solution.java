package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        if (args.length == 2 || args.length == 5) {
            ArrayList<String> price = new ArrayList<String>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                price.add(line);
            }
            bufferedReader.close();
            if (args[0].equals("-u")) {
                for (int i = 0; i < price.size(); i++) {
                    if (Long.parseLong(price.get(i).substring(0, 8).replaceAll("\\s", "")) == Long.parseLong(args[1])) {
                        String id = setSpaces(args[1], 8);
                        String trueProductName = setSpaces(args[2], 30);
                        String truePrice = setSpaces(args[3], 8);
                        String trueQuantity = setSpaces(args[4], 4);
                        price.add(i, id + trueProductName + truePrice + trueQuantity);
                        price.remove(i+1);
                        break;
                    }
                }
            }
            if (args[0].equals("-d")) {
                for (int i = 0; i < price.size(); i++) {
                    if (Long.parseLong(price.get(i).substring(0, 8).replaceAll("\\s", "")) == Long.parseLong(args[1]))
                        price.remove(i);
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(str, false));
            for (int i = 0; i < price.size(); i++) {
                bw.write(price.get(i));
                bw.newLine();
            }

            bw.close();
        }

    }


    public static String setSpaces (String previousName, int count) {
        String trueName;
        if (previousName.length() > count)
            trueName = previousName.substring(0, count);
        else {
            String s="";
            for (int i = 0; i < (count  - previousName.length()); i++)
                s = s+ " ";
            trueName = previousName+s;
        }
        return trueName;
    }
}