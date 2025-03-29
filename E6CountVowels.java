package org.example.CodingTask;

public class E6CountVowels {
    // Method to count vowels in a string
    public static int countVowels(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Initialize a counter for vowels
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        // Return the count of vowels
        return vowelCount;
    }

    // Main method to test the vowel counting method
    public static void main(String[] args) {
        // Test with the string "documentation"
        String testString = "documentation";

        // Print the result
        System.out.println("Number of vowels in '" + testString + "': " + countVowels(testString));
    }
}
