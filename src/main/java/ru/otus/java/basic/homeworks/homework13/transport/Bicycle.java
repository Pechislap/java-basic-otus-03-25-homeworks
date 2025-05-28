package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Human;

public class Bicycle implements MeansOfTransportation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public boolean movementForest(int distance, Human human) {
        human.takeTransport(Transport.Bicycle);
        System.out.println(getName() + " преодолел густой лес");
        human.leaveTransport(Transport.Bicycle);
        return true;
    }

    @Override
    public boolean movementPlain(int distance, Human human) {
        human.takeTransport(Transport.Bicycle);
        System.out.println(getName() + " преодолел равнину");
        human.leaveTransport(Transport.Bicycle);
        return true;
    }

    @Override
    public boolean movementSwamp(int distance, Human human) {
        human.takeTransport(Transport.Bicycle);
        System.out.println(getName() + " не может передвигаться по болоту");
        human.leaveTransport(Transport.Bicycle);
        return false;
    }

}
