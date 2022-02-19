package easy.验证回文串;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：验证回文串
 * 创建时间：2022/2/19 22:45
 * 创 建 人：petteran
 */

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuffer.append(Character.toLowerCase(c));
            }
        }
        StringBuffer reverse = new StringBuffer(stringBuffer).reverse();
        return stringBuffer.toString().equals(reverse.toString());
    }
}
