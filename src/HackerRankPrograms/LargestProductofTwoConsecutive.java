package HackerRankPrograms;

import java.util.Scanner;

public class LargestProductofTwoConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-9999;
        int product=0,i;
        int[] num=new int[n];
        if(n==1)
            System.out.println("List has fewer than two elements, so no consecutive product can be calculated.");
        else{
            for( i=0;i<n;i++)
                num[i]=sc.nextInt();
            for( i=0;i<n-1;i++){
                product=num[i]*num[i+1];
                if(max<product)
                    max=product;
            }
            System.out.println(max);
        }

    }
}
