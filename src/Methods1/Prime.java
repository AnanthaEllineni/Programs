package Methods1;

public class Prime {
    public void disp() {
        int num = 27;
        int temp=0;
        for (int i = 1; i <= num/2 ; ++i) {
            if (num % i == 0) {
                temp++;
            }
        }
        if (temp==1) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
