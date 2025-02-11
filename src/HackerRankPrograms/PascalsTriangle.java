package HackerRankPrograms;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            //Spaces
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            int val=1;
            for(j=1;j<=i;j++){
                System.out.print(val +" ");
                val=val * (i-j)/j;
            }
            System.out.println();
        }


    }

}
