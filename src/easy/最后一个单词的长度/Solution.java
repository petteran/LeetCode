package easy.最后一个单词的长度;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：最后一个单词的长度
 * 创建时间：2022/2/12 17:13
 * 创 建 人：petteran
 */

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 * 返回字符串中最后一个单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (s.charAt(i) == ' ') {
            i--;
        }
        int wordLength=0;
        while (i >= 0 && s.charAt(i) != ' ') {
            wordLength++;
            i--;
        }
        return wordLength;

    }

}
