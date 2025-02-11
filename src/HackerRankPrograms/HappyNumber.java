package HackerRankPrograms;

import java.util.Scanner;

public class HappyNumber {
    public static int isSquare(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int res=n;
        while(true) {
            res = isSquare(res);
            if (res == 1) {
                System.out.println("true");
                break;
            } else if(res==n){
                System.out.println("false");
                break;
            }
        }
    }
}
