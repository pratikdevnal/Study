import java.util.*;

public class checkPalindrome {
    public static void main(String[] args) {
        String word = "racpar";
        System.out.println(palindrome(word));
    }

    public static boolean palindrome(String word) {
        for (int i = 0; i <= word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}