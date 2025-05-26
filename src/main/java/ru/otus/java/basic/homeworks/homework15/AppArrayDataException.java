package ru.otus.java.basic.homeworks.homework15;

public class AppArrayDataException extends Exception {
    public AppArrayDataException(int row, int col) {
        super("Ошибка преобразования данных в ячейке [" + row + ", " + col + "]");
    }
}
