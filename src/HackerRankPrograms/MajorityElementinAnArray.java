package HackerRankPrograms;

import java.util.Scanner;

public class MajorityElementinAnArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        int maxFreq = -9999, element = 0;
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    freq++;
                if (freq > maxFreq) {
                    maxFreq = freq;
                    element = a[i];
                }
            }

        }
        System.out.println(element);
    }
}
