package Programs;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num =sc.nextInt();
        int temp=0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {
                temp++;
            }
        }
        if (temp==1) {
            System.out.println(temp+" Prime number");
        } else {
            System.out.println(temp+" Not prime number");
        }
    }
}
