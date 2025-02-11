package HackerRankPrograms;

import java.util.Scanner;

public class NumDivisibleByTheSumOfItsDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=Math.abs(n);

        int sum=0;
        int temp=a;
        while(temp>0){
            sum+=temp%10;
            temp=temp/10;
        }
        if(a%sum==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
