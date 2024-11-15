package HackerRankPrograms;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int rem=0;
        int rev=0;
        while(a>0) {
            rem=a%10;
            a=a/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);

    }
}
