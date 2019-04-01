package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman extends Worker {
        public void workHard();
    }

    public static interface Secretary extends Worker {
        public void workLazy();
    }

    public static interface Miner extends Worker {
        public void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
