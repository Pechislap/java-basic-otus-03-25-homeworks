package ru.otus.java.basic.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite <= 0) {
            return;
        } else {
            this.appetite = appetite;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void toEat(Plate plate) {
        if (satiety) {
            return;
        }
        satiety = plate.useUpFood(appetite);
        if (satiety) {
            System.out.println(getName() + " сыт");
        } else {
            System.out.println(getName() + " остался голодным");
        }
    }
}

