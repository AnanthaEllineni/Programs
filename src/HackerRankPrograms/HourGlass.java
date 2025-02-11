package HackerRankPrograms;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;

        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }

            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
