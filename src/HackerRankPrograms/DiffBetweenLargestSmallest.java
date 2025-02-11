package HackerRankPrograms;

import java.util.Scanner;

public class DiffBetweenLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = Math.abs(n);
        int largestDigit = -999999;
        int smallestDigit = 999999;
        if(a<10){
            System.out.println(0);
        }else{
            while (a > 0) {
                int digit =a%10;
                if (digit > largestDigit) {
                    largestDigit = digit;
                }
                if (digit < smallestDigit) {
                    smallestDigit = digit;
                }
                a /= 10;
            }
            int difference = largestDigit - smallestDigit;
            System.out.println(difference);
        }
    }
}