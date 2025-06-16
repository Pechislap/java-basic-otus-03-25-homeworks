package ru.otus.java.basic.homeworks.homework16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillArrayList {

    public static List<Integer> generateRange(int min, int max) {
        try {
            if (min > max) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.err.println("Максимальное значение должно быть больше или равно минимальному значению");
        }

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumElementsGreaterThanFive(List<Integer> integers) {
        int sum = 0;
        for (Integer i : integers) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fillCellWithNumber(int number, List<Integer> list) {
        list.replaceAll(ignored -> number);
    }

    public static void increaseCellWithNumber(int number, List<Integer> list) {
        list.replaceAll(ignored ->ignored + number);
    }
}
