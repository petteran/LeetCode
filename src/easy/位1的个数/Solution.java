package easy.位1的个数;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：位1的个数
 * 创建时间：2022/2/15 21:21
 * 创 建 人：petteran
 */

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），
 * 返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;

    }
}
