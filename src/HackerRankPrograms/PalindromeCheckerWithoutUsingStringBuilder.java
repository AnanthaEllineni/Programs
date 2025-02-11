package HackerRankPrograms;

import java.util.Scanner;

public class PalindromeCheckerWithoutUsingStringBuilder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String result = "";

            // Loop through the string to append only alphanumeric characters
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    result += s.charAt(i);  // Append to the result string
                }
            }
            String original = result.toLowerCase();
            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);  // Build the reversed string
            }
            if (original.equals(reversed)) {
                System.out.println("True");  // It's a palindrome
            } else {
                System.out.println("False");  // It's not a palindrome
            }
        }
    }