package Strings;

public class ConStringEvenPosToUppercase {
        public static void main(String[] args) {
            String s = "convert even positions";
            String result = "";

            // Loop through each character of the string
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    // Convert character at even index to uppercase
                    result += Character.toUpperCase(s.charAt(i));
                } else {
                    // Keep the character as it is for odd index
                    result += s.charAt(i);
                }
            }

            // Print the result
            System.out.println(result);
        }
    }