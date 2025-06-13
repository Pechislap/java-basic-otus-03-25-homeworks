package ru.otus.java.basic.homeworks.homework16;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<String> namesEmployee(List<Employee> employees) {
        List<String> names = new ArrayList<>();

        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> ageAboveTheMinimum(List<Employee> employees, int minAge) {
        List<Employee> age = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                age.add(employee);
            }
        }
        return age;
    }

    public static boolean averageAge(List<Employee> employees, int minAverageAge) {

        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        int averageAge = totalAge / employees.size();
        if (averageAge > minAverageAge) {
            System.out.println("Средний возраст сотрудников превышает " + minAverageAge + " лет");
            return true;
        } else {
            System.out.println("Средний возраст сотрудников не превышает " + minAverageAge + " лет");
            return false;
        }
    }

    public static Employee youngestEmployee(List<Employee> employees) {

        Employee youngest = employees.getFirst();

        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = " + name +
                ", age=" + age +
                '}';
    }
}
