package ru.otus.java.basic.homeworks.homework11.animal;

public class Animal {

    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int endurance;
    protected int runEnduranceCosts;
    protected int swimEnduranceCosts;
    protected int distance;

    public Animal(String name,
                  float runSpeed,
                  float swimSpeed,
                  int endurance,
                  int runEnduranceCosts,
                  int swimEnduranceCosts,
                  int distance) {

        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runEnduranceCosts = runEnduranceCosts;
        this.swimEnduranceCosts = swimEnduranceCosts;
        this.distance = distance;
    }

    public float run() {

        int distance = this.distance;
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

    public void info() {
        int expendedEndurance1 = distance * runEnduranceCosts;
        int expendedEndurance2 = distance * swimEnduranceCosts;
        int runTired = endurance - expendedEndurance1;
        int swimTired = endurance - expendedEndurance2;

        System.out.println();
        if (runTired <= 0) {
            System.out.println(name + " не может бежать, запас выносливоти = " + runTired);
        } else {
            System.out.println(name + " готов бежать, запас выносливости = " + runTired);
        }
        if (swimTired <= 0) {
            System.out.println(name + " не может плыть, запас выносливоти = " + swimTired);
        } else {
            System.out.println(name + " готов плыть, запас выносливоти = " + swimTired);
        }
    }

    public float swim() {

        int distance = this.distance;
        float time = distance / swimSpeed;
        int expendedEndurance = distance * swimEnduranceCosts;
        if (expendedEndurance > endurance) {
            System.out.print(name + " появилось состояние усталости, не смог проплыть " + distance + " м ");
            return -1;
        } else {
            System.out.print(name + " проплыл " + distance + " м ");
            return time;
        }
    }
}
