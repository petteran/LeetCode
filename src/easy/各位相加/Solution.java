package easy.各位相加;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：各位相加
 * 创建时间：2022/2/16 23:11
 * 创 建 人：petteran
 */

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 */
public class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
