package com.example;

public class StringUtils {

        // Utility method to reverse a string
        public static String reverseString(String input) {
                if (input == null) {
                        return null;
                }
                return new StringBuilder(input).reverse().toString();
        }

        // main method should be removed since this is a utility class and this class need not be run, it only needs to provide the functionality
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed String: " + reverseString(input));
        scanner.close();
    }
    */
}
