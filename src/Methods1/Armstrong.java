package Methods1;

public class Armstrong {
    public void dis(){
            int n = 153;
            int temp = n;
            int rem=0;
            int sum=0;
            while(n>0) {
                rem=n%10;
                sum=sum+rem*rem*rem;
                n=n/10;
            }
            if(temp==sum) {
                System.out.println(temp+" is Armstrong Number");
            }
            else {
                System.out.println(temp+" is Not Armstrong Number");
            }
        }

    }
