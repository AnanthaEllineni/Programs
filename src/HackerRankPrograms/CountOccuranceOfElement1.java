package HackerRankPrograms;
import java.util.Scanner;

public class CountOccuranceOfElement1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // Number of elements
            int[] arr = new int[n]; // Array to store the input elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Store each element in the array
            }

            int target = sc.nextInt(); // Target element whose occurrences you need to count

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }