package HackerRankPrograms;

import java.util.Scanner;

public class CommonElemInTwoLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int[] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        int m=sc.nextInt();
        int [] b=new int[m];
        for( j=0;j<m;j++)
            b[j]=sc.nextInt();

        i=0;j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            }
            else{
                while(i<n && a[i] <b[j])
                    i++;
                while(j<m && i<n && b[j]<a[i])
                    j++;
            }
        }
    }
}
