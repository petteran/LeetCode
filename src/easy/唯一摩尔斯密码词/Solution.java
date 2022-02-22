package easy.唯一摩尔斯密码词;
import java.util.HashSet;
import java.util.Set;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：唯一摩尔斯密码词
 * 创建时间：2022/2/22 23:22
 * 创 建 人：petteran
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        Set<String> seen = new HashSet<>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }
        return seen.size();
    }
}
