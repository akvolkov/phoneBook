package com.my.company;

import java.util.*;

/**
 * This is Main Class
 */
public class Main {
    private static Map<String, List<String>> phoneBook = new HashMap<>();
    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }
    public static void main(String[] args) {
        final App app = new App(phoneBook);
        System.out.println("Enter FIO!");
        String fio = app.readFio();
        app.printPhones(fio);
    }
}
