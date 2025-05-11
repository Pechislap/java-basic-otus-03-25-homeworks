package ru.otus.java.basic.homeworks.homework11.animal;

public class Cat extends Animal {
    public Cat(
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

    @Override
    public float swim() {
        System.out.println();
        System.out.print(name + " не умеет плавать ");
        return -1;
    }

    @Override
    public void info() {
        System.out.println();
        int expendedEndurance1 = distance * runEnduranceCosts;
        int runTired = endurance - expendedEndurance1;

        System.out.println();
        if (runTired <= 0) {
            System.out.println(name + " не может бежать, запас выносливоти = " + runTired);
        } else {
            System.out.println(name + " готов бежать, запас выносливости = " + runTired);
        }
        if (swimEnduranceCosts == 0) {
            System.out.println(name + " не может плавать");
        }
    }


}
