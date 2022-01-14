package easy.有效的字母异位词;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：有效的字母异位词
 * 创建时间：2022/1/15 00:09
 * 创 建 人：petteran
 */

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 *
 */
public class Solution {
    public static void main(String[] args) {
        String s= "anagram";
        String t= "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] cnt = new int[26];
        int[] cns = new int[26];
        for (char c : s.toCharArray()) {
            cns[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt[c-'a']++;
        }

        for (int i = 0; i <26 ; i++) {
            if (cns[i] != cnt[i]) {
                return false;
            }
        }
        return true;

    }
}
