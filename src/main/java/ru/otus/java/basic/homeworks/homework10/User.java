package ru.otus.java.basic.homeworks.homework10;

public class User {
    public int getAge;
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge(int i){
        return 2025 - birthYear;
    }

    public User(String surname, String name, String patronymic, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void Info() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Гож рождения: " + birthYear);
        System.out.println("email: " + email);
    }
}

