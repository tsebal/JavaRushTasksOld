package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        List<Integer> list = new ArrayList<>();
        for (int n = 1; n < N; n++){
            int sum = 0, temp, r;

            temp = n;
            long length = (int) (Math.log10(n)+1);
            while( temp != 0 ) {
                for (int i = 0; i < length; i++) {
                    int prod = 1;
                    r = temp%10;
                    for(int j = 0; j < length; j++){
                        prod = prod *r;
                    }
                    sum = sum + prod;
                    temp = temp/10;
                }
            }
            if ( n == sum )
                list.add(n);
        }
        result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.println(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNumbers(370).length);
    }
}
