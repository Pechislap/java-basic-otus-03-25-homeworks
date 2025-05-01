package ru.otus.java.basic.homeworks.homework5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

        String[] stringsArr = {"My name is Vyacheslav"};
        int[] arr = new int[6];
        printStrings(arr, stringsArr);

        int[] arr1 = {4, 7, 10, 3, 3, 9, 8};
        sumMore5(arr1);

        int[] arr2 = new int[8];
        int value = 5;
        fillArray(arr2, value);

        int[] arr3 = {2, 4, 6, 3};
        int value1 = 2;
        fillArrayNumberIncreasedByValue(arr3, value1);

        int[] arr4 = {6, 4, 2, 4};
        sumOfElementsOfWhichOfHalves(arr4);
    }

    public static void printStrings(int[] arr, String[] stringsArr) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(stringsArr));
        }
    }

    public static void sumMore5(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayNumberIncreasedByValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sumOfElementsOfWhichOfHalves(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum1 += arr[i];
        }
        if (sum > sum1) {
            System.out.println("Сумма элементов первой половины массива больше суммы элементов второй половины");
        } else if (sum == sum1) {
            System.out.println("Сумма элементов первой половины массива равна сумме элементов второй половины");
        } else if (sum < sum1) {
            System.out.println("Сумма элементов первой половины массива меньше суммы элементов второй половины");
        }
    }
}
