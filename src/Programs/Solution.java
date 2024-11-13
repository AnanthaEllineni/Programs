package Programs;

public class Solution {

    public static int dayOfYear(String date) {
        // Days in each month for non-leap years
        int[] daysInMonthRegular = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Split the date string into year, month, day
        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Determine if it's a leap year
        boolean isLeap = isLeapYear(year);

        // Choose the correct days array based on whether the year is a leap year or not
        int[] daysInMonth = isLeap ? daysInMonthLeap : daysInMonthRegular;

        // Use a helper method to sum the days of previous months
        int totalDays = sumDaysBeforeMonth(month, daysInMonth) + day;

        return totalDays;
    }

    // Helper function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper method to sum the days of all months before the given month (1-based index)
    private static int sumDaysBeforeMonth(int month, int[] daysInMonth) {
        // We sum up all days from months before the given month (1-based index)
        if (month <= 1) return 0;  // If the month is January, no months before
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += daysInMonth[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(dayOfYear("2019-01-09"));  // Output: 9
        System.out.println(dayOfYear("2019-02-10"));  // Output: 41
    }
}



