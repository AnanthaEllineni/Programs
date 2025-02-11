package HackerRankPrograms;

import java.util.Scanner;

public class PassorFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int marks=sc.nextInt();
        if(marks>=75){
            System.out.println("Grade A");
        }
        else if (marks<75 && marks>=55) {
            System.out.println("Grade B");
        }
        else if(marks<55 && marks>=30){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
