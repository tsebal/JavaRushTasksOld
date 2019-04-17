package com.javarush.task.task14.task1419;

import javax.naming.NamingException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Class<?> aClass = Class.forName("");
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;
        }
        catch(Exception e) {
            exceptions.add(e);

        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream file = new FileInputStream("d:\\zxcvv.txt");
        }
        catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new NamingException();
        }
        catch (NamingException e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedException();
        }
        catch (InterruptedException e) {
            exceptions.add(e);
        }
    }
}
