package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Human;

public class Horse implements MeansOfTransportation {
    private String name;
    private final int enduranceMovementThroughForest;
    private final int enduranceMovementAcrossPlain;
    private int endurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnduranceMovementThroughForest() {
        return enduranceMovementThroughForest;
    }

    public int getEnduranceMovementAcrossPlain() {
        return enduranceMovementAcrossPlain;
    }

    public int getEndurance() {
        return endurance;
    }

    public Horse(String name) {
        this.name = name;
        this.enduranceMovementThroughForest = 2;
        this.enduranceMovementAcrossPlain = 1;
        this.endurance = 5000;
    }

    @Override
    public boolean movementForest(int distance, Human human) {
        human.takeTransport(Transport.Spirit);
        endurance -= distance * enduranceMovementThroughForest;

        if (endurance < 0) {
            endurance = 0;
            System.out.println(getName() + " не смог преодолеть густой лес, устал");
            human.leaveTransport(Transport.Spirit);
            return false;
        } else {
            System.out.println(getName() + " преодолел густой лес");
            human.leaveTransport(Transport.Spirit);
            return true;
        }
    }

    @Override
    public boolean movementPlain(int distance, Human human) {
        human.takeTransport(Transport.Spirit);
        endurance -= distance * enduranceMovementAcrossPlain;

        if (endurance < 0) {
            endurance = 0;
            System.out.println(getName() + " не смог преодолеть равнину, устал");
            human.leaveTransport(Transport.Spirit);
            return false;
        } else {
            System.out.println(getName() + " преодолел равнину");
            human.leaveTransport(Transport.Spirit);
            return true;
        }
    }

    @Override
    public boolean movementSwamp(int distance, Human human) {
        human.takeTransport(Transport.Spirit);
        System.out.println(getName() + " не может передвигаться по болоту");
        human.leaveTransport(Transport.Spirit);
        return false;
    }
}
