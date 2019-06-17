package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        Set<File> fileset = new TreeSet<File>();
        while (!(fileName = reader.readLine()).equals("end")) {
            File file = new File(fileName);
            fileset.add(file);
        }
        reader.close();

        Iterator<File> fileIterator = fileset.iterator();
        String folder = fileIterator.next().getAbsolutePath();
        folder = folder.substring(0, folder.length() - 6);
        FileOutputStream resultFile = new FileOutputStream(folder, true);
        for (File file : fileset) {
            FileInputStream in = new FileInputStream(file);
            byte[] buffer = new byte[in.available()];
            while (in.available() > 0) {
                in.read(buffer);
                resultFile.write(buffer);
            }
            in.close();
        }
        resultFile.close();
    }
}
