package HackerRankPrograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class IsPrime {
        public static int isPrime(int n){
            if(n==2||n==3)
                return 1;
            if(n%2==0||n%3==0)
                return 0;

            for(int i=2;i*i<=n;i++)
                if(n%i==0)
                    return 0;
            return 1;


        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(IsPrime.isPrime(n)==1)
                System.out.println("True - Prime");
            else
                System.out.println("False - Not Prime");
        }
}
