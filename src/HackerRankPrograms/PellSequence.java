package HackerRankPrograms;

import java.util.Scanner;

public class PellSequence {
        public static void main(String[] args) {
            // Reading input
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            // Handle base cases directly
            if (N == 0) {
                System.out.println(0);
                return;
            }
            if (N == 1) {
                System.out.println(1);
                return;
            }

            // Variables to store P(n-1) and P(n-2)
            int prev2 = 0; // P(0)
            int prev1 = 1; // P(1)
            int current = 0;

            // Iteratively compute P(N)
            for (int i = 2; i <= N; i++) {
                current = 2 * prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }

            // Output the result
            System.out.println(current);
        }
    }