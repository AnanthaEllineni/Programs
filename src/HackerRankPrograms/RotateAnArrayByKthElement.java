package HackerRankPrograms;

import java.util.Scanner;

public class RotateAnArrayByKthElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int x=a[n-1];
            for(int j=0;j<n;j++){
                int temp=a[j];
                a[j]=x;
                x=temp;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}