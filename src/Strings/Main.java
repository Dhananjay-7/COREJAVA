package Strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";  // Original String

    // Attempt to modify the string
    String str2 = str1.concat(" World"); // Creates a new string, does not modify str1

    // Print the strings
    System.out.println("Original String (str1): " + str1); // Output: Hello
    System.out.println("New String (str2): " + str2);       // Output: Hello World

    // Verify if str1 and str2 point to the same object
    System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); 
    }
}
