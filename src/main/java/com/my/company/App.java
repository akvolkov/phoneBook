package com.my.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    static Map<String, List<String>> phoneBook = new HashMap<>();
    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }
    public static void main(String[] args) {
        System.out.println("Enter FIO!");
        String fio = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            boolean isValidFio = false;
            while (!isValidFio) {
                System.out.print("fio:>");
                fio = reader.readLine();
                isValidFio = phoneBook.containsKey(fio);
                if (!isValidFio) {
                    System.out.println("There is no such name in the database");
                }
            }
        } catch (IOException e) {
            System.out.println("I/O problem");
        }
        List<String> phones = phoneBook.get(fio);
        int i = 0;
        for (String phone: phones
             ) {
            System.out.println(String.format("%d. %s", ++i, phone));
        }
    }
}
