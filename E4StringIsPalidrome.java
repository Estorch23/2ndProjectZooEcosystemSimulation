package org.example.CodingTask;

public class E4StringIsPalidrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Initialize left and right pointers
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;  // Move left pointer towards the center
            right--; // Move right pointer towards the center
        }
        return true; // String is a palindrome
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String test1 = "rotator";
        String test2 = "people";

        // Check if test strings are palindromes
        System.out.println(test1 + " is palindrome: " + isPalindrome(test1));
        System.out.println(test2 + " is palindrome: " + isPalindrome(test2));
    }
}


