package HackerRankPrograms;

import java.util.Scanner;

public class ArithmeticSequenceSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,n,d;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+a;
            a =a+ d;
        }
        System.out.println(sum);
    }
}
