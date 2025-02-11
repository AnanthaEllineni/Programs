package HackerRankPrograms;

import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                a++;
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                b++;
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                c++;
                System.out.print(arr[i] + " ");
            }
        }
    }
}