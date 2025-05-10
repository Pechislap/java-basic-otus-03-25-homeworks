package ru.otus.java.basic.homeworks.homework11.animal;

public class Animal {

    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int endurance;
    protected int runEnduranceCosts;
    protected int swimEnduranceCosts;
    protected boolean canSwim;
    protected float time;

    public Animal(String name,
                  float runSpeed,
                  float swimSpeed,
                  int endurance,
                  int runEnduranceCosts,
                  int swimEnduranceCosts,
                  boolean canSwim) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runEnduranceCosts = runEnduranceCosts;
        this.swimEnduranceCosts = swimEnduranceCosts;
        this.canSwim = true;
    }

    public float run(int distance) {

        float time = distance / runSpeed;
        int expendedEndurance = distance * runEnduranceCosts;
        if (expendedEndurance > endurance) {
            System.out.println();
            System.out.println(name + " пробежал " + distance + " м, появилось состояние усталости.");

        } else {
            System.out.println(name + " пробежал " + distance + " м за " + time + " сек");
        }
        return time;
    }
}
