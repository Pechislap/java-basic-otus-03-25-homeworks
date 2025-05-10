package ru.otus.java.basic.homeworks.homework11.animals;

public abstract class Animal {

    protected String name;
    protected float runningSpeed;
    protected float swimmingSpeed;
    protected int endurance;
    protected boolean swimming;
    protected int distance;
    protected int tired;

    public Animal(
            String name, float runningSpeed, float swimmingSpeed, int endurance, boolean swimming) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.swimming = swimming;
    }


}



