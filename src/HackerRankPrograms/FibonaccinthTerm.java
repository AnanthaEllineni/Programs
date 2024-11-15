package HackerRankPrograms;

import java.util.Scanner;

public class FibonaccinthTerm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=0,c=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(a);

    }
}
