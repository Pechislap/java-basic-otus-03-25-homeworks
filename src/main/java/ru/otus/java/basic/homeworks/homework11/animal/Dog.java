package ru.otus.java.basic.homeworks.homework11.animal;

public class Dog extends Animal {
    public Dog(
            String name,
            float runSpeed,
            float swimSpeed,
            int endurance,
            int runEnduranceCosts,
            int swimEnduranceCosts,
            int distance) {
        super(name,
                runSpeed,
                swimSpeed,
                endurance,
                runEnduranceCosts,
                swimEnduranceCosts,
                distance);
    }
}
