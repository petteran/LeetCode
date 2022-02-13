package easy.x的平方根;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：x的平方根
 * 创建时间：2022/2/13 20:41
 * 创 建 人：petteran
 */

/**
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 */
public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int exp = (int) Math.exp(0.5 * Math.log(x));
        return (long) (exp + 1) * (exp + 1) <= x ? exp + 1 : exp;
    }
}
