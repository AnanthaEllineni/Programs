package HackerRankPrograms;

public class CamelCase {
    public static int camelcase(String s) {
        int count = 1;

        // Use a normal for loop to iterate over the string characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  // Get the character at position i

            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}