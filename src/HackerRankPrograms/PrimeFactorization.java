package HackerRankPrograms;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=2;
        int temp=n;
        for(int i=2;i<=n;i++){
            while(temp%i==0){
                temp=temp/i;
                System.out.println(i);
            }
        }
    }
}
