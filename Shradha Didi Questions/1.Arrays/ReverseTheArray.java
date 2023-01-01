// Reverse a String

// BasicAccuracy: 69.49%Submissions: 195K+Points: 1

// You are given a string s. You need to reverse the string.

// Example 1:

// Input:
// s = Geeks
// Output: skeeG
// Example 2:

// Input:
// s = for
// Output: rof
// Your Task:

// You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

// Expected Time Complexity: O(|S|).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= |s| <= 10000

import java.util.*;

public class ReverseTheArray {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

}
