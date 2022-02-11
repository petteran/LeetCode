package easy.爬楼梯;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：爬楼梯
 * 创建时间：2022/2/11 16:51
 * 创 建 人：petteran
 */
public class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;

        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}
