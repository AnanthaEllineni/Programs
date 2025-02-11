package HackerRankPrograms;

import java.util.Scanner;

public class SquaresNumber {
    public static boolean isSquare(int n){
        int i=1;
        for( i=0;i*i<=n;i++)
            if(i*i==n)
                return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(isSquare(a))
                System.out.print(a+" ");
        }
    }
}