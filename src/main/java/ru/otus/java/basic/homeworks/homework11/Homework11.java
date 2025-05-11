package ru.otus.java.basic.homeworks.homework11;

import ru.otus.java.basic.homeworks.homework11.animal.Cat;
import ru.otus.java.basic.homeworks.homework11.animal.Dog;
import ru.otus.java.basic.homeworks.homework11.animal.Horse;

public class Homework11 {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", 1, 0, 10, 1, 0, 20);

        Dog dog = new Dog("Buddy", 3, 1, 30, 1, 2, 30);

        Horse horse = new Horse("Spirit", 10, 3, 3000, 1, 4, 500);

        cat.setDistance(10);
        System.out.println();
        System.out.printf("за %.2f cек%n", cat.run());
        System.out.printf("за %.2f cек%n", dog.run());
        System.out.printf("за %.2f cек%n", horse.run());

        System.out.printf("за %.2f cек%n", cat.swim());
        System.out.printf("за %.2f cек%n", dog.swim());
        System.out.printf("за %.2f cек%n", horse.swim());

        cat.info();
        dog.info();
        horse.info();


    }
}
