package ru.otus.java.basic.homeworks.homework17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> hmPhoneBook;

    public PhoneBook() {
        hmPhoneBook = new HashMap<>();
    }

    public void add(String fio, String phoneNumber) {

         if (!hmPhoneBook.containsKey(fio)){
            hmPhoneBook.put(fio, new HashSet<>());
        }
        hmPhoneBook.get(fio).add(phoneNumber);
    }

    public Set<String> findByFio(String fio) {
        return hmPhoneBook.get(fio);
    }

    public Set<String> findAllFio() {
        return hmPhoneBook.keySet();
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> phoneNumbers : hmPhoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}