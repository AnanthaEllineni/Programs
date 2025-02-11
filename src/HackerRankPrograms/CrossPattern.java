package HackerRankPrograms;
import java.util.Scanner;

public class CrossPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // Print '*' on the main diagonal (i == j)
                    if (i == j) {
                        System.out.print("*");
                    }
                    // Print space on the anti-diagonal (i + j == n + 1)
                    else if (i + j == n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" "); // Fill the rest with spaces
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }