package HackerRankPrograms;

import java.util.Scanner;

public class PrimeDigitsinaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
