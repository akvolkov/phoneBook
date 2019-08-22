package com.my.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

class App {
    private Map<String, List<String>> phoneBook;

    App(Map<String, List<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    /**
     * read fio with console
     * @return FirstName, SecondName and MiddleName of users
     */
    String readFio() {
        String fio = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            boolean isValidFio = false;
            while (!isValidFio) {
                System.out.print("fio> ");
                fio = reader.readLine();
                isValidFio = phoneBook.containsKey(fio);
                if (!isValidFio) {
                    System.out.println("There is no such name in the database");
                }
            }
        } catch (IOException e) {
            System.out.println("I/O problem");
        }
        return fio;
    }

    /**
     * print list of phones
     * @param fio - FirstName, SecondName and MiddleName of users
     */
    void printPhones(String fio) {
        int i = 0;
        for (String phone: phoneBook.get(fio)
        ) {
            System.out.println(String.format("%d. %s", ++i, phone));
        }
    }
}
