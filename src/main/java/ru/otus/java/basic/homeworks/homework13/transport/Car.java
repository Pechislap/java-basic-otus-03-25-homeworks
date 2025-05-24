package ru.otus.java.basic.homeworks.homework13.transport;

public class Car implements MeansOfTransportation {
    private String name;
    private float fuel;
    private final float fuelMovementAcrossPlain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFuelMovementAcrossPlainl() {
        return fuelMovementAcrossPlain;
    }

    public float getFuelL() {
        return fuel;
    }

    public Car(String name) {
        this.fuelMovementAcrossPlain = 2f;
        this.name = name;
        this.fuel = 60f;
    }

    @Override
    public boolean movementForest(int distance, Human human) {
        human.takeTransport(Transport.Car);
        System.out.println(getName() + " не может передвигаться по лесу");
        human.leaveTransport(Transport.Car);
        return false;
    }

    @Override
    public boolean movementPlain(int distance, Human human) {
        human.takeTransport(Transport.Car);
        fuel -= distance * (fuelMovementAcrossPlain / 1000);
        if (fuel < 0) {
            fuel = 0;
            System.out.println(getName() + " не смог преодолеть равнину, не хватило топлива");
            human.leaveTransport(Transport.Car);
            return false;
        } else {
            System.out.println(getName() + " преодолел равнину");
            human.leaveTransport(Transport.Car);
            return true;
        }
    }

    @Override
    public boolean movementSwamp(int distance, Human human) {
        human.takeTransport(Transport.Car);
        System.out.println(getName() + " не может передвигаться по болоту");
        human.leaveTransport(Transport.Car);
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", fuel=" + fuel +
                ", fuelMovementAcrossPlain=" + fuelMovementAcrossPlain +
                '}';
    }
}
