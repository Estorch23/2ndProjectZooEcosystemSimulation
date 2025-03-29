package org.example.CodingTask;

public class E7CountWordsInString {



    public static int countWords(String str) {
        // Use regex to match words (sequences of letters or numbers)
        String[] words = str.trim().split("[^a-zA-Z0-9']+");

        // Return the number of words, ensuring no empty words are counted
        return words.length == 0 && str.trim().isEmpty() ? 0 : words.length;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String testString1 = "Hello, world!";
        String testString2 = "Working is fun.";
        String testString3 = "   This  is  a    test.   ";
        String testString4 = " ";

        // Print the result for each test string
        System.out.println("Number of words in '" + testString1 + "': " + countWords(testString1));
        System.out.println("Number of words in '" + testString2 + "': " + countWords(testString2));
        System.out.println("Number of words in '" + testString3 + "': " + countWords(testString3));
        System.out.println("Number of words in an empty string: " + countWords(testString4));
    }

}

