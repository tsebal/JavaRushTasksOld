package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Кот-дедушка имя: ");
        String name = reader.readLine();
        Cat catGrndpa = new Cat(name);

        //System.out.println("Кошка-бабушка имя: ");
        name = reader.readLine();
        Cat catGrndMa = new Cat(name);

        //System.out.println("Кот-отец имя: ");
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrndpa, null);

        //System.out.println("Кошка-мать имя: ");
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrndMa);

        //System.out.println("Кот-сын имя: ");
        name = reader.readLine();
        Cat catSon = new Cat(name, catFather, catMother);

        //System.out.println("Кошка-дочь имя: ");
        name = reader.readLine();
        Cat catDaughter = new Cat(name, catFather, catMother);

        System.out.println(catGrndpa);
        System.out.println(catGrndMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentF;
        private Cat parentM;

        Cat(String name) {
            this.name = name;
            this.parentF = null;
            this.parentM = null;
        }

        Cat(String name, Cat parentF, Cat parentM) {
            this.name = name;
            this.parentF = parentF;
            this.parentM = parentM;
        }

        @Override
        public String toString()
        {
            if (parentF != null && parentM == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parentF.name;
            else if (parentF == null && parentM != null)
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            else if (parentF == null && parentM == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
            else if(parentF != null && parentM != null )
                return "The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentF.name;
            else
                return null;
        }
    }

}