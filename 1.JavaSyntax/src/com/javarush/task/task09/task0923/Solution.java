package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String glas = "";
        String soglas = "";
        String spc = " ";;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= spc.charAt(0)) {
                if (isVowel(str.charAt(i)))
                    glas += Character.toString(str.charAt(i)) + " ";
                else
                    soglas += Character.toString(str.charAt(i)) + " ";
            }
        }
        System.out.println(glas);
        System.out.println(soglas);
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels) {   //ищем среди массива гласных
            if (c == d)
                return true;
        }
        return false;
    }
}
