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
                  int swimEnduranceCosts) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runEnduranceCosts = runEnduranceCosts;
        this.swimEnduranceCosts = swimEnduranceCosts;
    }

    public float run(int distance) {

        float time = distance / runSpeed;
        int expendedEndurance = distance * runEnduranceCosts;
        if (expendedEndurance > endurance) {
            System.out.println();
            System.out.print(name + " появилось состояние усталости, не смог пробежать " + distance + " м ");
            return -1;
        } else {
            System.out.print(name + " пробежал " + distance + " м ");
            return time;
        }
    }
    public float swim(int distance) {

        float time = distance / swimSpeed;
        int expendedEndurance = distance * swimEnduranceCosts;
        if (expendedEndurance > endurance) {
            System.out.print(name + " появилось состояние усталости, не смог проплыть " + distance + " м ");
            return -1;
        } else {
            System.out.print(name + " проплыл " + distance + " м ");
            return time;
        }

    }public void info (){

    }
}
