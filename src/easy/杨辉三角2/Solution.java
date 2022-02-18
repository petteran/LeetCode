package easy.杨辉三角2;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：杨辉三角2
 * 创建时间：2022/2/18 22:37
 * 创 建 人：petteran
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> curRow = new ArrayList<>();
        curRow.add(1);
        if (rowIndex == 0) {
            return curRow;
        }

        List<Integer> preRow = getRow(rowIndex - 1);
        for (int i = 0; i < preRow.size() - 1; i++) {
            curRow.add(preRow.get(i) + preRow.get(i + 1));
        }
        curRow.add(1);
        return curRow;
    }
}
