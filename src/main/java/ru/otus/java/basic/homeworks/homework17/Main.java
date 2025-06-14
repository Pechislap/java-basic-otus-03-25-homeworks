package ru.otus.java.basic.homeworks.homework17;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", "+79001237456");
        phoneBook.add("Иванов Иван Иванович", "+79001237456");
        phoneBook.add("Петров Петр Петрович", "+79001237458");
        phoneBook.add("Сидоров Сидор Сидорович", "+79001237459");
        phoneBook.add("Сидоров Сергей Иванович", "+79001237460");
        phoneBook.add("Иванов Иван Иванович", "+79001234566");

        System.out.println(phoneBook.containsPhoneNumber("+79001234566"));
        phoneBook.add("Филонов Сергей Викторович","+79001234566");
        System.out.println(phoneBook.findByFio("Филонов Сергей Викторович"));
        System.out.println(phoneBook.findByFio("Иванов Иван Иванович"));
        System.out.println(phoneBook.findAllFio());
    }
}
