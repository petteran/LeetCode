package easy.有效的数独;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：有效的数独
 * 创建时间：2022/1/13 22:26
 * 创 建 人：petteran
 */
public class Solution {
    public static void main(String[] args) {
        char[][] arr =
                {
                        {'7','.','.','.','4','.','.','.','.'},
                        {'.','.','.','8','6','5','.','.','.'},
                        {'.','1','.','2','.','.','.','.','.'},
                        {'.','.','.','.','.','9','.','.','.'},
                        {'.','.','.','.','5','.','5','.','.'},
                        {'.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.'},
                };

        boolean validSudoku = isValidSudoku(arr);
        System.out.println(validSudoku);

    }
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i <9 ; i++) {
            HashSet<Integer> ColSet = new HashSet<>();
            HashSet<Integer> RowSet = new HashSet<>();
            for (int j = 0; j <9 ; j++) {
                int c1 = board[j][i] == '.' ? 10 : board[j][i] - '1';
                if (c1 != 10) {
                    boolean add = ColSet.add(c1);
                    if (!add){ return false;}
                }
                int c =board[i][j] == '.' ? 10 : board[i][j] - '1';
                if (c != 10) {
                    boolean add = RowSet.add(c);
                    if (!add){return false;}
                }
            }
        }
        return true;
    }
}
