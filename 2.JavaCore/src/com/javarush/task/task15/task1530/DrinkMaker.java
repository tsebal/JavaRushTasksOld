package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {
    abstract public void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
