package HackerRankPrograms;

import java.util.Scanner;

public class FirsLastOcuusingBinSear {
    public static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid =(high + low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        int first = findOccurrence(a, s, true);
        int last = findOccurrence(a, s, false);

        System.out.println(first + " " + last);
    }

}
