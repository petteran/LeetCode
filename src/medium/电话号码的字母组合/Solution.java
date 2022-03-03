package medium.电话号码的字母组合;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：电话号码的字母组合
 * 创建时间：2022/3/03 23:51
 * 创 建 人：petteran
 */


import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 */

public class Solution {
    // 每个数字到字母的映射
    String[] mapping = new String[] {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> res = new LinkedList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return res;
        }
        // 从 digits[0] 开始进行回溯
        backtrack(digits, 0, new StringBuilder());
        return res;

    }

    // 回溯算法主函数
    void backtrack(String digits, int start, StringBuilder sb) {
        if (sb.length() == digits.length()) {
            // 到达回溯树底部
            res.add(sb.toString());
            return;
        }
        // 回溯算法框架
        for (int i = start; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            for (char c : mapping[digit].toCharArray()) {
                // 做选择
                sb.append(c);
                // 递归下一层回溯树
                backtrack(digits, i + 1, sb);
                // 撤销选择
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
