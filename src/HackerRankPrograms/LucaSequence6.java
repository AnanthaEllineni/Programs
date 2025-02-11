package HackerRankPrograms;

import java.util.Scanner;

public class LucaSequence6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println(2);
                return;
            }
            if (n == 1) {
                System.out.println(1);
                return;
            }

            // Variables to store L(n-1) and L(n-2)
            int prev2 = 2; // L(0)
            int prev1 = 1; // L(1)
            int current = 0;

            // Iteratively compute L(n)
            for (int i = 2; i <= n; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            System.out.println(current);
        }
    }