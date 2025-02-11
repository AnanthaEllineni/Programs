package HackerRankPrograms;

import java.util.Scanner;

public class RevOrderWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String s=sc.nextLine();
        String [] str=s.split(" ");

        for(int i=str.length-1;i>=0;i--){
            if(str[i].isEmpty()==false)
                System.out.print(str[i]+" ");
        }
    }
}
