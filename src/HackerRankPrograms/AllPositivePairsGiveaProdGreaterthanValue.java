package HackerRankPrograms;

import java.util.Scanner;

public class AllPositivePairsGiveaProdGreaterthanValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int i,j,ch=0;
        for( i=0;i<n-1;i++){
            for( j=i+1;j<n;j++)
                if (a[i] * a[j] > k) {
                    ch=1;
                    break;
                }
            if(ch==1)
                break;
        }
        if(ch==1)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
