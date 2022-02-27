package medium.无重复字符的最长子串;

import java.util.HashSet;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：无重复字符的最长子串
 * 创建时间：2022/2/27 22:42
 * 创 建 人：petteran
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
