package org.example.CodingTask;

public class E1Swap2Strings {
    private String a;
    private String b;

    //Creating a constructor to initiate the string//
    public E1Swap2Strings(String a, String b) {
        this.a = a;
        this.b = b;
    }
    // Create a method to swap the strings without a temporary variable//

    public void swapStrings() {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
    }
    // Create a method to display the swapped strings
    public void displayStrings() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        //create an Object//
    E1Swap2Strings swap2Strings = new E1Swap2Strings("Hello", "World");
        System.out.println("Before Swap:");
        swap2Strings.displayStrings();

        // Swap the strings
        swap2Strings.swapStrings();

        System.out.println("After Swap:");
        swap2Strings.displayStrings();
    }
}