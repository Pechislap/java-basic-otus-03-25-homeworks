package ru.otus.java.basic.homeworks.homework11.animal;

public class Animal {

    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int endurance;
    protected int runEnduranceCosts;
    protected int swimEnduranceCosts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Animal(String name, float runSpeed, float swimSpeed, int endurance, int runEnduranceCosts, int swimEnduranceCosts) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runEnduranceCosts = runEnduranceCosts;
        this.swimEnduranceCosts = swimEnduranceCosts;
    }

    public float run(int distance) {
        int enduranceCosts = distance * runEnduranceCosts;
        float time = distance / runSpeed;
        this.endurance = endurance - enduranceCosts;
        if (endurance >= 0) {
            System.out.print(getName() + " пробежал " + distance + " м, ");
            return time;
        } else {
            System.out.print(getName() + " не смог пробежать " + distance + " м, ");
            return -1;
        }
    }

    public float swim(int distance) {
        int enduranceCosts = distance * swimEnduranceCosts;
        float time = distance / swimSpeed;
        this.endurance = endurance - enduranceCosts;
        if (endurance >= 0) {
            System.out.print(getName() + " проплыл " + distance + " м, ");
            return time;
        } else {
            System.out.print(getName() + " не смог проплыть " + distance + " м, ");
            return -1;
        }
    }
    public void info(){
        System.out.println(getName() + ": ");
    }
}


