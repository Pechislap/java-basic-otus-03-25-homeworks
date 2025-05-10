package ru.otus.java.basic.homeworks.homework11;

import ru.otus.java.basic.homeworks.homework11.animal.Cat;
import ru.otus.java.basic.homeworks.homework11.animal.Dog;
import ru.otus.java.basic.homeworks.homework11.animal.Horse;

public class Homework11 {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik",
                1,
                0,
                10,
                1,
                0,
                false);

        Dog dog = new Dog("Buddy",
                3,
                3,
                30,
                1,
                2,
                true);

        Horse horse = new Horse("Spirit",
                10,
                10,
                100,
                1,
                4,
                true);

        cat.run(20);
        dog.run(30);
        horse.run(100);

    }
}
