package ru.otus.java.basic.homeworks.homework13.theArea;

import ru.otus.java.basic.homeworks.homework13.transport.MeansOfTransportation;
import ru.otus.java.basic.homeworks.homework13.transport.*;

public class Forest implements Area {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            return;
        } else {
            this.length = length;
        }
    }

    public Forest(int length) {
        this.length = length;
    }

    @Override
    public boolean getMoving(MeansOfTransportation m, Human human) {
        return m.movementForest(length, human);
    }
}
