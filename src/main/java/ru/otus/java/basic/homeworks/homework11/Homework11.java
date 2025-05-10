package ru.otus.java.basic.homeworks.homework11;

import ru.otus.java.basic.homeworks.homework11.animals.Cat;
import ru.otus.java.basic.homeworks.homework11.animals.Dog;
import ru.otus.java.basic.homeworks.homework11.animals.Horse;

public class Homework11 {
    public static void main(String[] args) {

        Cat cat = new Cat("Kot", 1, 0, 1, false);
        Dog dog = new Dog("Buddy", 2, 2, 2, true);
        Horse horse = new Horse("Spirit", 10, 10, 10, true);

        // cat.run(200);
        //dog.run(200);
        //horse.run(200);
    }
}
