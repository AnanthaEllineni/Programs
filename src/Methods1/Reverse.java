package Methods1;

public class Reverse {
    public void dis(){
        int n=321;
        int rem=0;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
