package ru.otus.java.basic.homeworks.homework13;

import ru.otus.java.basic.homeworks.homework13.theArea.Forest;
import ru.otus.java.basic.homeworks.homework13.theArea.Plain;
import ru.otus.java.basic.homeworks.homework13.theArea.Swamp;
import ru.otus.java.basic.homeworks.homework13.theArea.Area;
import ru.otus.java.basic.homeworks.homework13.transport.*;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Bob");
        Rover rover = new Rover("Rover");
        Horse horse = new Horse("Spirit");
        Car car = new Car("Car");
        System.out.println(car.toString());
        Bicycle bicycle = new Bicycle("Bicycle");

        human.takeTransport(Transport.Rover);
        human.takeTransport(Transport.Car);
        human.leaveTransport(Transport.Car);
        human.leaveTransport(Transport.Rover);

        MeansOfTransportation[] m = {
                new Horse("Spirit"),
                new Bicycle("Bicycle"),
                new Rover("Rover"),
                new Car("Car"),
                new Human("Bob")
        };

        Area[] a = {
                new Plain(5000),
                new Forest(5000),
                new Swamp(5000)
        };
        for (MeansOfTransportation meansOfTransportation : m) {
            for (Area area : a) {
                area.getMoving(meansOfTransportation, human);
            }
        }
    }
}
