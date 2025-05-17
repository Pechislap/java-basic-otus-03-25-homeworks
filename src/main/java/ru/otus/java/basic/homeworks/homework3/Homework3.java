package ru.otus.java.basic.homeworks.homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user;
        do {
            System.out.println("Для выбора метода введите номер от 1 до 5");
            user = scanner.nextInt();
        } while (user < 1 || user > 5);

        if (user == 1) {
            greeting();
        }
        if (user == 2) {
            checkSign();
        }
        if (user == 3) {
            selectColor();
        }
        if (user == 4) {
            compareNumbers();
        }
        if (user == 5) {
            addOrSubtractAndPrint();
        }

    }

    public static void greeting() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign() {
        int a = 10;
        int b = -33;
        int c = 5;
        int result = a + b + c;

        if (result < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

    }

    public static void selectColor() {
        int data = 4;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data >= 11 && data <= 20) {
            System.out.println("Жёлтый");
        }
        if (data >= 21) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void addOrSubtractAndPrint() {
        int initValue = 2;
        int delta = 10;
        boolean increment = true;
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }


    }
}

