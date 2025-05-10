package ru.otus.java.basic.homeworks.homework11.animal;

public class Animal {

    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int endurance;
    protected int runEnduranceCosts;
    protected int swimEnduranceCosts;
    protected boolean canSwim;

    public Animal(String name,
                  float runSpeed,
                  float swimSpeed,
                  int endurance,
                  int runEnduranceCosts,
                  int swimEnduranceCosts,
                  boolean canSwim)
    {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runEnduranceCosts = runEnduranceCosts;
        this.swimEnduranceCosts = swimEnduranceCosts;
        this.canSwim = true;
    }
}
