package easy.最长公共前缀;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：最长公共前缀
 * 创建时间：2022/1/27 23:20
 * 创 建 人：petteran
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return ans;
            }
        }

        return ans;
    }
}
