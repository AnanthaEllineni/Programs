package HackerRankPrograms;

import java.util.Scanner;

public class OddNumPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        int num=1;
        for (i=0; i<n; i++){
            for (j=0;j<n-i-1; j++){
                System.out.print(" ");
            }
            for (k=0; k<=i; k++ ){
                System.out.print(num +" ");
                num=num+2;
            }

            System.out.println();
        }
    }
}
