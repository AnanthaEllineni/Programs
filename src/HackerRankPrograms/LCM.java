package HackerRankPrograms;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcdValue = x;
        long lcmValue = (long) a * b / gcdValue;
        System.out.println(lcmValue);
    }
}
