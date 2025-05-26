package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Human;

public interface MeansOfTransportation {
    boolean movementPlain(int distance, Human human);

    boolean movementForest(int distance, Human human);

    boolean movementSwamp(int distance, Human human);
}
