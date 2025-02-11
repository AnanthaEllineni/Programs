package HackerRankPrograms;
    import java.util.Scanner;

    public class SmallestElementGreaterThanTarget {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int left = 0;
            int right = n - 1;
            int target = -1;
            while (left <= right) {
                int mid = (right + left) / 2;
                if (a[mid] > t) {
                    target = a[mid];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(target);
        }
    }