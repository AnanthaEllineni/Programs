package Programs;
import java.util.Arrays;


public class Anagram {
        public static void main(String[] args) {
            String s1 = "Earth";
            String s2 = "Heart";
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            if(s1.length() == s2.length()) {    // check if length is same
                char[] a1 = s1.toCharArray();  // convert strings to char array
                char[] a2 = s2.toCharArray();
                Arrays.sort(a1);            // sort the char array
                Arrays.sort(a2);
                boolean result = Arrays.equals(a1, a2); // if sorted char arrays are same
                                                                        // then the string is anagram
                if(result) {
                    System.out.println(s1 + " and " + s2 + " are anagram.");
                }
                else {
                    System.out.println(s1 + " and " + s2 + " are not anagram.");
                }
            }

        }
    }
