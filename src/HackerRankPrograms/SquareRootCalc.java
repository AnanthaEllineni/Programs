package HackerRankPrograms;

import java.util.Scanner;

public class SquareRootCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        for(i=1;i*i<=n;i++);
        System.out.println(i-1);
    }
}
