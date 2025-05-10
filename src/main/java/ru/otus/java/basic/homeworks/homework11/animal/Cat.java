package ru.otus.java.basic.homeworks.homework11.animal;

public class Cat extends Animal {
    public Cat(
            String name,
            float runSpeed,
            float swimSpeed,
            int endurance,
            int runEnduranceCosts,
            int swimEnduranceCosts,
            boolean canSwim) {
        super(name,
                runSpeed,
                swimSpeed,
                endurance,
                runEnduranceCosts,
                swimEnduranceCosts,
                canSwim);
    }
}
