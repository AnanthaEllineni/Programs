package HackerRankPrograms;

import java.util.Scanner;

public class FirstMissingPosInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ch=0;
        int i=0;
        for( i=1; ;i++){
            ch=0;
            for(int j=0;j<n;j++)
                if(i==a[j]){
                    ch=1;
                    break;
                }
            if(ch==0)
                break;
        }
        System.out.print(i);

    }
}
