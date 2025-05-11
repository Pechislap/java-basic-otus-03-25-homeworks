package ru.otus.java.basic.homeworks.homework11;

import ru.otus.java.basic.homeworks.homework11.animal.Cat;
import ru.otus.java.basic.homeworks.homework11.animal.Dog;
import ru.otus.java.basic.homeworks.homework11.animal.Horse;

public class Homework11 {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", 1, 0, 10, 1, 0);

        Dog dog = new Dog("Buddy", 3, 1, 30, 1, 2);

        Horse horse = new Horse("Spirit", 10, 3, 3000, 1, 4);

        System.out.println("за " + cat.run(20) + " c");
        System.out.println("за " + dog.run(30) + " c");
        System.out.println("за " + horse.run(500) + " c");

        System.out.println("за " + cat.swim(20) + " c");
        System.out.println("за " + dog.swim(30) + " c");
        System.out.println("за " + horse.swim(500) + " c");

    }
}
