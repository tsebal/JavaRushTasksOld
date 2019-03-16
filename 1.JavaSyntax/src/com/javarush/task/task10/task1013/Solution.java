package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int high;
        private int weight;
        private String rassa;

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public  Human(String name, int high, int weight){
            this.name = name;
            this.high = high;
            this.weight = weight;
        }

        public  Human(boolean sex, int high, int weight, String rassa){
            this.sex = sex;
            this.high = high;
            this.weight = weight;
            this.rassa = rassa;
        }

        public Human(String name, boolean sex, String rassa){
            this.name = name;
            this.sex = sex;
            this.rassa = rassa;
        }

        public Human(String name, String rassa){
            this.name = name;
            this.rassa = rassa;
        }

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, int high, int weight){
            this.age = age;
            this.high = high;
            this.weight = weight;
        }

        public Human(boolean sex, int high, int weight){
            this.sex = sex;
            this.high = high;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int high, int weight, String rassa){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.high = high;
            this.weight = weight;
            this.rassa = rassa;
        }
    }
}
