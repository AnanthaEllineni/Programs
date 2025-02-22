package HackerRankPrograms;

import java.util.Scanner;

public class TwoSuminArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] nums = new int[n];
         for (int i = 0; i < n; i++) {
             nums[i] = sc.nextInt();
         }
         int target = sc.nextInt();
         twoSum(nums, target);
     }
     public static void twoSum(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {
                     System.out.println(i + " " + j);
                     return;
                 }
             }
         }
     }
}