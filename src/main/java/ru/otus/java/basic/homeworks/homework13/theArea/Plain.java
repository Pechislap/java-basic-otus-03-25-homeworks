package ru.otus.java.basic.homeworks.homework13.theArea;

import ru.otus.java.basic.homeworks.homework13.Human;
import ru.otus.java.basic.homeworks.homework13.transport.MeansOfTransportation;

public class Plain implements Area {
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

    public Plain(int length) {
        this.length = length;
    }

    @Override
    public boolean getMoving(MeansOfTransportation m, Human human) {
        return m.movementPlain(length, human);
    }
}
