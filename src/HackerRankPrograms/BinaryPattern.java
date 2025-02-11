package HackerRankPrograms;

import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<=i;j++){
                if(((i+j)%2)==0)
                    System.out.print("1");
                else
                    System.out.print("0");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
