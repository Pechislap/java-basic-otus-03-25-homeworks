package ru.otus.java.basic.homeworks.homework11;


import ru.otus.java.basic.homeworks.homework11.animal.Cat;
import ru.otus.java.basic.homeworks.homework11.animal.Dog;
import ru.otus.java.basic.homeworks.homework11.animal.Horse;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Kruzik", 1, 0, 100, 1, 0);
        Dog dog = new Dog("Buddy", 3, 1, 300, 1,2);
        Horse horse = new Horse("Spirit", 10, 3, 30000,1,4);

        System.out.printf("время: %.2f cек%n",cat.run(10));
        System.out.printf("время: %.2f cек%n",dog.run(50));
        System.out.printf("время: %.2f cек%n",horse.run(1000));

        System.out.printf("время: %.2f cек%n",cat.swim(100));
        System.out.printf("время: %.2f cек%n",dog.swim(100));
        System.out.printf("время: %.2f cек%n",horse.swim(1000));

        cat.info();
        dog.info();
        horse.info();



    }
}
