package easy.杨辉三角;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：杨辉三角
 * 创建时间：2022/1/12 22:21
 * 创 建 人：petteran
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
class Solution {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; ++i) {
            List<Integer> integers = new ArrayList<>(i+1);
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    integers.add(1);
                }else {
                    integers.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(integers);
        }
        return list;
    }
}

