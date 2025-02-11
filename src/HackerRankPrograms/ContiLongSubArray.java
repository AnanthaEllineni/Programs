package HackerRankPrograms;

import java.util.Scanner;

public class ContiLongSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int len=1,max=-99999;
        for(int i=0;i<n;i++){
            if(i+1 < n && a[i]<a[i+1])
                len++;
            else{
                if(max < len)
                    max=len;
                len=1;
            }
        }
        System.out.println(max);

    }
}
