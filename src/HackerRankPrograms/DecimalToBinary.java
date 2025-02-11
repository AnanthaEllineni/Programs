package HackerRankPrograms;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int dec=sc.nextInt();
        StringBuilder bin=new StringBuilder();
        while(dec>0){
            bin.append(dec%2);
            dec/=2;
        }
        System.out.println("the binary representation of 10 is :"+bin.reverse());
    }
    }

