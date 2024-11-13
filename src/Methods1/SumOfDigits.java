package Methods1;

public class SumOfDigits {
    public void dis(){
        int n=342;
        int rem=0,sum=0;
        while(n>0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
            System.out.println(sum);
    }
}
