package HackerRankPrograms;

import java.util.Scanner;

public class DeleteAllVowelsInaStringUsingStringBuffer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                        ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }