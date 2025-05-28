package ru.otus.java.basic.homeworks.homework12;

public class CatMain {
    public static void main(String[] args) {
        Plate plate = new Plate(100, 100);
        Cat[] cats = {
                new Cat("Murzik", 45),
                new Cat("Barsik", 40),
                new Cat("Kotyk", 35)
        };
        for (Cat cat : cats) {
            cat.toEat(plate);

            System.out.println(plate);
        }
    }
}
