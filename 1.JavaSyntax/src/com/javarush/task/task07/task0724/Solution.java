package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution
{
    public static void main(String[] args) {
        Human grndPa1 = new Human("Anton", true, 67, null, null);
        Human grndPa2 = new Human("Vasya", true, 77, null, null);
        Human grndMa1 = new Human("Tonya", false, 66, null, null);
        Human grndMa2 = new Human("Lena", false, 62, null, null);
        Human father = new Human("Rafik", true, 42, grndPa1, grndMa1);
        Human mother = new Human("Anya", false, 40, grndPa2, grndMa2);
        Human child1 = new Human("Sonya", false, 20, father, mother);
        Human child2 = new Human("Roma", true, 21, father, mother);
        Human child3 = new Human("Sveta", false, 18, father, mother);

        System.out.println(grndPa1.toString());
        System.out.println(grndPa2.toString());
        System.out.println(grndMa1.toString());
        System.out.println(grndMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}