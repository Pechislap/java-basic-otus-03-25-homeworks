package ru.otus.java.basic.homeworks.homework11.animal;

public class Cat extends Animal {
    public Cat(String name, float runSpeed, float swimSpeed, int endurance, int runEnduranceCosts, int swimEnduranceCosts) {
        super(name, runSpeed, swimSpeed, endurance, runEnduranceCosts, swimEnduranceCosts);
    }

    @Override
    public float swim(int distance) {
        if (swimEnduranceCosts == 0) {
            System.out.print(getName() + " не умеет плавать ");
        }
        return -1;
    }

    @Override
    public void info() {
        if (endurance >= 1) {
            System.out.println(name + ": запас выносливости = " + endurance + ", может бежать, плавать не умеет");
        }else {
            System.out.println(name + ": запас выносливости исчерпан, не может бежать, плавать не умеет");
        }
    }
}
