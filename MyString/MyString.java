import java.lang.*;
import java.io.*;

public class MyString {
    public static void main(String[] args) {
        String myString = "Hello how are you";

        int charCount = myString.length();
        System.out.println("The number of characters in the string is: " + charCount);
        int count = 0;
        for (int i = 0; i < charCount; i++) {
            if (myString.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of spaces in the string: " + count);

        // Reverse the string and print it
        String reversedString = reverseString(myString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString();
    }
}

