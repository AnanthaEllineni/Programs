package Programs;

public class RomanToInt {
    public static void main(String[] args) {
        String s="MMMCMXIXI";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && roman(s.charAt(i))<roman(s.charAt(i+1))){
                sum=sum-roman(s.charAt(i));
            }
            else
                sum=sum+roman(s.charAt(i));
        }
        System.out.println(sum);
    }
    public static int roman(char ch){
        if(ch=='M')
            return 1000;
        else if(ch=='D')
            return 500;
        else if(ch=='C')
            return 100;
        else if(ch=='L')
            return 50;
        else if(ch=='X')
            return 10;
        else if(ch=='V')
            return 5;
        else
            return 1;
    }
}
