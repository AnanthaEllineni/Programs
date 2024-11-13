package Programs;

import java.util.Scanner;

public class Paterren1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val;
        int temp=n;
        for(int i=1;i<=temp;i++){
            for(int j=0;j<temp-i-1;j++) {
               // System.out.println("1 if");
                System.out.print(" ");
            }
                val=1;
                for(int j=1;j<=i;j++){
                  //  System.out.println("1 j");
                    System.out.print(val+" ");
                    val=val*(i-j)/(j);
                }
                System.out.println();
            }
        }
    }

