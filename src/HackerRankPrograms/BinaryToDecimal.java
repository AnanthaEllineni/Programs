package HackerRankPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int bin=sc.nextInt();
    int p=1,dec=0;
        while(bin>0){
        dec +=(bin%10)*p;
        bin/=10;
        p*=2;
    }
        System.out.println(dec);
}
}
