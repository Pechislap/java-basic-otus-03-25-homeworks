package ru.otus.java.basic.homeworks.homework16;

import java.util.ArrayList;
import java.util.List;

import static ru.otus.java.basic.homeworks.homework16.Employee.*;
import static ru.otus.java.basic.homeworks.homework16.FillArrayList.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(generateRange(5, 0));
        System.out.println(generateRange(0, 10));

        List<Integer> integers = new ArrayList<>( List.of(1, 8, 4, 20, 6, 10));
        System.out.println(sumElementsGreaterThanFive(integers));

        fillCellWithNumber(7,integers);
        System.out.println(integers);

        increaseCellWithNumber(3, integers);
        System.out.println(integers);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей", 30));
        employees.add(new Employee("Вячеслав", 24));
        employees.add(new Employee("Андрей", 50));
        employees.add(new Employee("Виктор", 18));
        employees.add(new Employee("Дмитрий", 41));

        System.out.println(namesEmployee(employees));
        System.out.println(ageAboveTheMinimum(employees, 30).toString());
        System.out.println(averageAge(employees, 30));
        System.out.println(youngestEmployee(employees));

    }
}


