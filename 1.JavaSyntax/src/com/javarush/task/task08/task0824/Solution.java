package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> children1 = new ArrayList<Human>();

        Human maloy1 = new Human("Vasya", true, 18, children1);
        Human maloy2 = new Human("Petya", true, 24, children1);
        Human maloy3 = new Human("Anya", false, 16, children1);
        children.add(maloy1);
        children.add(maloy2);
        children.add(maloy3);

        Human otets = new Human("Anton", true, 54, children);
        ArrayList<Human> otetsReb = new ArrayList<>();
        otetsReb.add(otets);

        Human matb = new Human("Lena", false, 46, children);
        ArrayList<Human> matbReb = new ArrayList<>();
        matbReb.add(matb);

        Human ded1 = new Human("Afanasiy", true, 74, otetsReb);
        Human ded2 = new Human("Saveliy", true, 72, matbReb);
        Human bab1 = new Human("Svetlana", false, 70, otetsReb);
        Human bab2 = new Human("Anna", false, 69, matbReb);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(otets);
        System.out.println(matb);
        System.out.println(maloy1);
        System.out.println(maloy2);
        System.out.println(maloy3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
}