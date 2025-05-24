package ru.otus.java.basic.homeworks.homework13.theArea;

import ru.otus.java.basic.homeworks.homework13.transport.MeansOfTransportation;
import ru.otus.java.basic.homeworks.homework13.transport.Human;

public interface Area {

    boolean getMoving(MeansOfTransportation m, Human human);
}
