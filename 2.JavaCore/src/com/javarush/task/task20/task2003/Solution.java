package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties props = new Properties();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        load(fileReader);
        reader.close();
        fileReader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        if (props.size() > 0)
            props.putAll(properties);
        props.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        props.load(inputStream);
        Set<String> list = props.stringPropertyNames();
        for (String current : list)
            properties.put(current, props.getProperty(current));
    }

    public static void main(String[] args) throws Exception {
        new Solution().fillInPropertiesMap();
        System.out.println(properties);
        new Solution().save(new FileOutputStream("c:/1.properties"));
    }
}
