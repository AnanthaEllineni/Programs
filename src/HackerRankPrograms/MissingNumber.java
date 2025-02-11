package HackerRankPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[] =new int[length];
        for (int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min=1;
        for(int i=0;i<length;i++){
            if(arr[i]>0&&min==arr[i]){
                min++;
            } else if (arr[i]>0 && arr[i]>min) {
                break;
            }
        }
        System.out.println(min);
    }
}
