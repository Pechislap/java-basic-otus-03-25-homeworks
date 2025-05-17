package ru.otus.java.basic.homeworks.homework11.animal;

public class Horse extends Animal {
    public Horse(String name, float runSpeed, float swimSpeed, int endurance, int runEnduranceCosts, int swimEnduranceCosts) {
        super(name, runSpeed, swimSpeed, endurance, runEnduranceCosts, swimEnduranceCosts);
    }

    @Override
    public void info() {
        if (endurance >= 4) {
            System.out.println(name + ": запас выносливости = " + endurance + ", может бежать или плыть");
        } else if (endurance >= 1) {
            System.out.println(name + ": запас выносливости = " + endurance + ", может бежать, для плавания не хватает выносливости");
        } else {
            System.out.println(name + ": запас выносливости исчерпан, не может бежать или плыть");
        }
    }
}
