package org.example.CodingTask;

import java.util.HashMap;

public class E9FirstNonRepeatingCharacter {
    public static char firstNonRepeating(String str) {
        // Use a HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string and count the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Traverse the string again to find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a placeholder (e.g., a space)
        return ' '; // You can return any placeholder character or even throw an exception
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstNonRepeating(input);
        System.out.println("The first non-repeating character is: " + result);
    }
}


