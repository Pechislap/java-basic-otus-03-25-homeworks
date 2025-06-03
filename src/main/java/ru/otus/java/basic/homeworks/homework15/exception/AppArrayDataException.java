package ru.otus.java.basic.homeworks.homework15.exception;

public class AppArrayDataException extends RuntimeException {
    private int row;
    private int col;
    private String value;

    public int getCol() {
        return col;
    }

    public String getValue() {
        return value;
    }

    public int getRow() {
        return row;
    }

    public AppArrayDataException(int row, int col, String[][] array) {
        super("Не возможно преобразовать в число ячейку [" + row + "]" + "[" + col + "]: " + array[row][col]);
        this.row = row;
        this.col = col;
        this.value = array[row][col];


    }
}