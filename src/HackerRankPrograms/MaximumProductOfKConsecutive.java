package HackerRankPrograms;

import java.util.Scanner;

public class MaximumProductOfKConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int max=-99999999,prod;
        for(int i=0;i<=n-k;i++){
            prod=1;
            for(int j=i;j<i+k;j++)
                prod *=a[j];
            if(prod > max)
                max=prod;
        }
        System.out.println(max);
    }
}
