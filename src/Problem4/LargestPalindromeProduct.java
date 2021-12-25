package Problem4;

// A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.Stack;
import java.util.TreeSet;

public class LargestPalindromeProduct {
    static Stack<Character> stack;
    static TreeSet<Integer> list;

    static boolean isPalindrome(String n) {
        stack = new Stack<>();
        char[] chars = n.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        for (char aChar : chars) {
            if (stack.pop() != aChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        list = new TreeSet<>();
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; --j) {
                int x = i * j;
                if (isPalindrome(String.valueOf(x))) {
                    list.add(x);
                }
            }
        }
        System.out.println(list.last());
    }
}
