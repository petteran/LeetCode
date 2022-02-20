package easy.二的幂;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：2 的幂
 * 创建时间：2022/2/20 20:04
 * 创 建 人：petteran
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
