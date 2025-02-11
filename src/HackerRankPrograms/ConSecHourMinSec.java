package HackerRankPrograms;

import java.util.Scanner;

public class ConSecHourMinSec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hours=n/3600;       // Hours from total seconds
        int min=(n%3600)/60;     // Minutes from remaining seconds
        int sec=(n%3600)%60;     // Seconds from remaining after minutes

        System.out.printf("%02d:%02d:%02d",hours,min,sec);
    }
}
