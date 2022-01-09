package easy.回文数;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：回文数
 * 创建时间：2022/1/9 23:54
 * 创 建 人：petteran
 */

import java.util.stream.IntStream;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 */
class Solution {
    public static void main(String[] args) {
        int x =121;
        int y = 122;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
    }


    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        String s = (new StringBuilder("" + x)).reverse().toString();
        return (x + "").equals(s);
    }
}

