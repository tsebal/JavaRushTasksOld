package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        String str = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str = reader.readLine();

            if (str.equals("helicopter"))
                result = new Helicopter();
            else
                if (str.equals("plane")) {
                    int passCount = Integer.parseInt(reader.readLine());
                    result = new Plane(passCount);
                }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
