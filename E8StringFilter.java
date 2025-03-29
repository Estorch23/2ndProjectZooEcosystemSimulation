package org.example.CodingTask;

import java.util.ArrayList;
import java.util.List;

public class E8StringFilter {

    public static List<String> filterAndLowercase(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith("A")) {
                result.add(s.toLowerCase());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "kiwi", "Avocado", "grape", "Almond");
        List<String> result = filterAndLowercase(strings);
        System.out.println(result);
    }
}

