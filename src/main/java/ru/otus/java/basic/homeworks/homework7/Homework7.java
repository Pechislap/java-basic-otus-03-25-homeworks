package ru.otus.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 3, 6}, {-3, 5, 9}};
        System.out.println(sumOfPositiveElements(arr2d));
        System.out.println();

        squareOfSymbols(20);

        int[][] mass2d1 = new int[10][10];
        fillMass2d(mass2d1, 1);

        for (int i = 0; i < mass2d1[0].length; i++) {
            mass2d1[i][i] = 0;
        }

        printMass2d(mass2d1);

        int[][] mass2d2 = new int[10][10];
        fillMass2d(mass2d2, 1);
        mass2d2[1][7] = 8;
        mass2d2[2][2] = 5;
        printMass2d(mass2d2);

        int max = findMax(mass2d2);
        System.out.println("max " + max);
        System.out.println();

        int[][] mass2d3 = new int[10][10];
        fillMass2d(mass2d3, 4);
        for (int i = 0; i < mass2d3[1].length; i++)
            mass2d3[1][i] = 0;
        printMass2d(mass2d3);
        System.out.println(sumString(mass2d3));
    }

    private static int sumString(int[][] in) {
        int sum = 0;
        int empty = -1;
        for (int i = 0; i < in[1].length; i++) {
            if (in[1][i] > 0) {
                sum += in[1][i];
            } else {
                return empty;
            }
        }
        return sum;
    }

    private static int findMax(int[][] in) {
        int max = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j] > max) {
                    max = in[i][j];
                }
            }
        }
        return max;
    }

    private static void squareOfSymbols(int size) {
        char[][] mass2d = new char[size][size];
        fillMass2d(mass2d, '*');
        printMass2d(mass2d);
    }

    private static void fillMass2d(char[][] in, char simbol) {

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++)
                in[i][j] = simbol;
        }
    }

    private static void printMass2d(char[][] in) {
        for (int i = 0; i <= in[0].length; i++) {
            System.out.printf("%2d ", i - 1);
        }
        System.out.println();
        for (int i = 0; i < in.length; i++) {
            System.out.printf("%2d ", i);
            for (int j = 0; j < in[i].length; j++) {
                System.out.printf("%2c ", in[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void fillMass2d(int[][] in, int value) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                in[i][j] = value;
            }
        }
    }

    private static void printMass2d(int[][] in) {
        for (int i = 0; i <= in[0].length; i++) {
            System.out.printf("%2d ", i - 1);
        }
        System.out.println();
        for (int i = 0; i < in.length; i++) {
            System.out.printf("%2d ", i);
            for (int j = 0; j < in[i].length; j++) {
                System.out.printf("%2d ", in[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int sumOfPositiveElements(int[][] in) {
        int result = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j] > 0) {
                    result += in[i][j];
                }
            }
        }
        return result;
    }
}


