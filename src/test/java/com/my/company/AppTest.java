package com.my.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for App.
 */
public class AppTest {
    private static Map<String, List<String>> phoneBook = new HashMap<>();
    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }

    // Тут нечего тестировать
    // оО что тут можно оттестировать? оО
    @Test
    public void printPhones() {
        final App app = new App(phoneBook);
        app.printPhones("Иванов И.И.");
    }
}
