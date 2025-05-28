package ru.otus.java.basic.homeworks.homework13;


import ru.otus.java.basic.homeworks.homework13.transport.Transport;

public class Human {

    private String name;

    private int endurance;
    private final int enduranceMovementThroughForest;
    private final int enduranceMovementAcrossPlain;
    private final int enduranceMovementThroughSwamp;
    private String currentTransport;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndurance() {
        return endurance;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public int getEnduranceMovementThroughForest() {
        return enduranceMovementThroughForest;
    }

    public int getEnduranceMovementAcrossPlain() {
        return enduranceMovementAcrossPlain;
    }

    public int getEnduranceMovementThroughSwamp() {
        return enduranceMovementThroughSwamp;
    }


    public Human(String name) {
        this.enduranceMovementThroughForest = 2;
        this.enduranceMovementAcrossPlain = 1;
        this.enduranceMovementThroughSwamp = 3;
        this.name = name;
        this.endurance = 5000;
        this.currentTransport = null;
    }

    public boolean takeTransport(Transport transport) {
        if (getCurrentTransport() == null) {
            System.out.println(getName() + " сел на " + transport);
            currentTransport = transport.name();
        } else {
            System.out.println("Покиньте " + getCurrentTransport() + " чтобы сесть на " + transport);
        }
        return false;
    }

    public boolean leaveTransport(Transport transport) {
        if (currentTransport == transport.name()) {
            System.out.println(getName() + " покинул " + transport);
            currentTransport = null;
        } else if (currentTransport == null) {
            System.out.println("Сначала сядьте на " + transport + " чтобы покинуть его");

        } else {
            System.out.println("Вы не можете покинуть " + transport + " потому-что находитесь на " + getCurrentTransport());
        }
        return false;
    }

    public boolean movementForest(int distance) {
        endurance -= distance * enduranceMovementThroughForest;
        if (getCurrentTransport() == null) {
            if (endurance < 0) {
                endurance = 0;
                System.out.println(getName() + " не смог преодолеть лес, не хватило сил");
                return false;
            } else {
                System.out.println(getName() + " преодолел лес");
            }
        }
        return true;
    }

    public boolean movementPlain(int distance) {
        endurance -= distance * enduranceMovementAcrossPlain;
        if (getCurrentTransport() == null) {
            if (endurance < 0) {
                endurance = 0;
                System.out.println(getName() + " не смог преодолеть равнину, не хватило сил");
                return false;
            } else {
                System.out.println(getName() + " преодолел равнину");
            }
        }
        return true;
    }

    public boolean movementSwamp(int distance) {
        endurance -= distance * enduranceMovementThroughSwamp;
        if (getCurrentTransport() == null) {
            if (endurance < 0) {
                endurance = 0;
                System.out.println(getName() + " не смог преодолеть болото, не хватило сил");
                return false;
            } else {
                System.out.println(getName() + " преодолел болото");
            }
        }
        return true;
    }
}
