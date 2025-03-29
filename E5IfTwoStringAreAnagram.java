package org.example.CodingTask;

import java.util.Arrays;

public class E5IfTwoStringAreAnagram {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String test1 = "listen";
        String test2 = "silent";
        String test3 = "kind";
        String test4 = "ambitios";

        // Check if the strings are anagrams
        System.out.println(test1 + " and " + test2 + " are anagrams: " + areAnagrams(test1, test2));
        System.out.println(test3 + " and " + test4 + " are anagrams: " + areAnagrams(test3, test4));
    }
}

