package ru.otus.java.basic.homeworks.homework11.animal;

public class Cat extends Animal {
    public Cat(
            String name,
            float runSpeed,
            float swimSpeed,
            int endurance,
            int runEnduranceCosts,
            int swimEnduranceCosts) {
        super(name,
                runSpeed,
                swimSpeed,
                endurance,
                runEnduranceCosts,
                swimEnduranceCosts);
    }

    @Override
    public float swim(int distance) {
        System.out.println();
        System.out.print(name + " не умеет плавать ");
        return 0;
    }


}
