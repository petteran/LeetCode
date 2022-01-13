package medium.矩阵置零;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：矩阵置零
 * 创建时间：2022/1/14 00:29
 * 创 建 人：petteran
 */

import java.util.Arrays;

/**
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 */
public class Solution {
    public static void main(String[] args) {
        int[][] matrix ={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        Arrays.stream(matrix).forEach(items-> {Arrays.stream(items).forEach(System.out::print);
            System.out.println();});
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
