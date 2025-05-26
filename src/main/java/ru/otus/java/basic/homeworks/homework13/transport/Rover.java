package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Human;

public class Rover implements MeansOfTransportation {
    private String name;
    private float fuel;
    private final float fuelMovementAcrossPlain;
    private final float fuelMovementThroughForest;
    private final float fuelMovementThroughSwamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFuelMovementAcrossPlain() {
        return fuelMovementAcrossPlain;
    }

    public float getFuelMovementThroughForest() {
        return fuelMovementThroughForest;
    }

    public float getFuelMovementThroughSwamp() {
        return fuelMovementThroughSwamp;
    }

    public float getFuel() {
        return fuel;
    }

    public Rover(String name) {
        this.fuelMovementAcrossPlain = 10f;
        this.fuelMovementThroughForest = 20f;
        this.fuelMovementThroughSwamp = 50f;
        this.name = name;
        this.fuel = 300f;
    }

    @Override
    public boolean movementForest(int distance, Human human) {
        human.takeTransport(Transport.Rover);
        fuel -= distance * (fuelMovementThroughForest / 1000);
        if (fuel < 0) {
            fuel = 0;
            System.out.println(getName() + " не смог преодолеть лес, не хватило топлива");
            human.leaveTransport(Transport.Rover);
            return false;
        } else {
            System.out.println(getName() + " преодолел лес");
            human.leaveTransport(Transport.Rover);
            return true;
        }
    }

    @Override
    public boolean movementPlain(int distance, Human human) {
        human.takeTransport(Transport.Rover);
        fuel -= distance * (fuelMovementAcrossPlain / 1000);
        if (fuel < 0) {
            fuel = 0;
            System.out.println(getName() + " не смог преодолеть равнину, не хватило топлива");
            human.leaveTransport(Transport.Rover);
            return false;
        } else {
            System.out.println(getName() + " преодолел равнину");
            human.leaveTransport(Transport.Rover);
            return true;
        }
    }

    @Override
    public boolean movementSwamp(int distance, Human human) {
        human.takeTransport(Transport.Rover);
        fuel -= distance * (fuelMovementThroughSwamp / 1000);
        if (fuel < 0) {
            fuel = 0;
            System.out.println(getName() + " не смог преодолеть болото, не хватило топлива");
            human.leaveTransport(Transport.Rover);
            return false;
        } else {
            System.out.println(getName() + " преодолел болото");
            human.leaveTransport(Transport.Rover);
            return true;
        }

    }
}
