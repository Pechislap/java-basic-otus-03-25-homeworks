package ru.otus.java.basic.homeworks.homework12;

public class Plate {
    private int food;
    private int maxFood;

    public int getFood() {
        return food;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(int maxFood) {
        if (maxFood < 0) {
            return;
        } else {
            this.maxFood = maxFood;
        }
    }

    public Plate(int food, int maxFood) {
        this.food = food;
        this.maxFood = maxFood;
    }

    public void addFood(int addFood) {
        if (addFood + food <= maxFood) {
            food = addFood + food;
        } else {
            return;
        }
    }

    public boolean useUpFood(int upFood) {
        if (upFood <= food) {
            this.food = food - upFood;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                ", maxFood=" + maxFood +
                '}';
    }
}
