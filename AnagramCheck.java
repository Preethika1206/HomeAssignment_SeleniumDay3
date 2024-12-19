package week1.day3.HomeAssignemt;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Define the input strings
        String text1 = "stops";
        String text2 = "potss";

        // Step 1: Check if the lengths of the two strings are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
            return;  // Exit the program
        }

        // Step 2: Convert both strings to character arrays
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        // Step 3: Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Check if the sorted arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not Anagram.");
        }
    }
}
