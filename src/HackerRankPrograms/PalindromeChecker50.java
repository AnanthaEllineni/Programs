package HackerRankPrograms;

import java.util.Scanner;

public class PalindromeChecker50 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                // Create a StringBuilder to store only alphanumeric characters.
                StringBuilder sb = new StringBuilder();

                // Loop through the input string and append only alphanumeric characters(letters and digits).
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isLetterOrDigit(s.charAt(i))) {
                        sb.append(s.charAt(i));
                    }
                }

                // Store the original string in lowercase for comparison
                String original = sb.toString().toLowerCase();

                // Reverse the content of the StringBuilder and compare
                String reversed = sb.reverse().toString().toLowerCase();

                // Check if the original and reversed strings are the same
                if (original.equals(reversed)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        }