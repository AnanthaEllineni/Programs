package Methods1;

public class Palindrome {
    public void dis(){
        int n=121;
        int rev=0,rem;
        int temp =n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            System.out.println(temp+ " is a palindrome");
            else
                System.out.println(temp+ "is not a palindrome");
        }
    }

