package HackerRankPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            System.out.println("true-Palindrome");
        else
            System.out.println("false-Not Palindrome");
    }

}
