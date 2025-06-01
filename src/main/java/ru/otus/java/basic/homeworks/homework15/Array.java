package ru.otus.java.basic.homeworks.homework15;

import ru.otus.java.basic.homeworks.homework15.exception.AppArrayDataException;
import ru.otus.java.basic.homeworks.homework15.exception.AppArraySizeException;


public class Array {

    public static int sumArrayElements(String[][] array) throws AppArraySizeException {
        for (String[] strings : array) {
            for (int j = 0; j < strings.length; j++)

                if (array.length != 4 || strings.length != 4) {
                    throw new AppArraySizeException("Размер массива должен быть 4x4");
                }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j, array);
                }
            }
        }

        return sum;
    }
}