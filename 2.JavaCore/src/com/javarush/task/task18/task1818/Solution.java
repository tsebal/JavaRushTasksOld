package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter r1 = new FileWriter(reader.readLine());
        FileReader r2 = new FileReader(reader.readLine());
        FileReader r3 = new FileReader(reader.readLine());
        reader.close();
        while (r2.ready()) {
            r1.write(r2.read());
        }
        while (r3.ready()) {
            r1.append((char) r3.read());
        }
        r1.close();
        r2.close();
        r3.close();
    }
}
