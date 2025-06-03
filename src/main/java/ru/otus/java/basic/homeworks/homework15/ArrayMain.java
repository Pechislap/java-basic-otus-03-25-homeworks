package ru.otus.java.basic.homeworks.homework15;

import ru.otus.java.basic.homeworks.homework15.exception.AppArrayDataException;
import ru.otus.java.basic.homeworks.homework15.exception.AppArraySizeException;

import static ru.otus.java.basic.homeworks.homework15.Array.sumArrayElements;

public class ArrayMain {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "8", "3", "4"},
                {"4", "16", "8", "8"},
                {"0", "1", "11", "52"},
                {"13", "9", "10", "16"}
        };

        try {
            int result = sumArrayElements(correctArray);
            System.out.println("Сумма всех элементов: " + result);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e.getMessage());
        }

        String[][] incorrectSizeArray = {
                {"7", "2", "9"},
                {"3", "10"},
                {"78", "80", "97"},
                {"1", "2", "3", "7"}
        };

        try {
            sumArrayElements(incorrectSizeArray);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e.getMessage());
        }

        String[][] incorrectDataArray = {
                {"3", "F", "5", "4"},
                {"0", "8", "7", "9"},
                {"9", "1", "11", "19"},
                {"13", "12", "17", "16"}
        };

        try {
            sumArrayElements(incorrectDataArray);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e.getMessage());
        }
   }
}
