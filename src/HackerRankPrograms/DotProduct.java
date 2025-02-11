package HackerRankPrograms;

import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();

        int m=sc.nextInt();
        int[] num1=new int[m];
        int sum=0;
        for(int i=0;i<m;i++)
            num1[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            sum=sum+num[i]*num1[i];

        System.out.println(sum);


    }
}
