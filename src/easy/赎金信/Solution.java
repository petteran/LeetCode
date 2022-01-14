package easy.赎金信;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：赎金信
 * 创建时间：2022/1/14 23:35
 * 创 建 人：petteran
 */

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 *
 */
public class Solution {
    public static void main(String[] args) {
        String ransomNote = "ccccclllll";
        String magazine = "aaabbbkkkkkkkb";
        boolean b = canConstruct(ransomNote, magazine);
        System.out.println(b);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            cnt[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
          cnt[ransomNote.charAt(i) - 'a']--;
            if (cnt[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }



}
