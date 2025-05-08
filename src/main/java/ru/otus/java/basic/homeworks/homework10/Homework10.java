package ru.otus.java.basic.homeworks.homework10;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        User[] users = {
                new User("Петров", "Пётр", "Петрович", 2003, "petrov@mail.ru"),
                new User("Сидоров", "Сидор", "Сидорович", 1974, "sidorov@mail.ru"),
                new User("Дементьев", "Дементий", "Дементьевич", 2008, "dementev@mai.ru"),
                new User("Голубев", "Сергей", "Петрович", 1996, "golubev@mail.ru"),
                new User("Голубев", "Сергей", "Петрович", 1996, "golubev@mail.ru"),
                new User("Зафаров", "Зафар", "Зафарович", 2000, "zafarov@mail.ru"),
                new User("Ким", "Вячеслав", "Константинович", 1966, "pechislap@gmail.com"),
                new User("Ломоносов", "Михайло", "Васильевич", 1711, "lomonosov@mail.ru"),
                new User("Наумов", "Сергей", "Борисович", 2005, "naumov@mail.ru"),
                new User("Филонов", "Сергей", "Александрович", 1984, "filonov@mai.ru")
        };
        System.out.println();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge(i) > 40) {
                users[i].Info();
                System.out.println();
            }
        }
        Box box = new Box(20, "Red");
        box.info();
        box.open();
        box.putThing("Книга");
        box.close();
        box.open();
        box.removeThing("Книга");
        //box.close();
        box.putThing("hh");
    }
}



