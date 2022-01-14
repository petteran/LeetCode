package easy.字符串中的第一个唯一字符;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：字符串中的第一个唯一字符
 * 创建时间：2022/1/14 23:00
 * 创 建 人：petteran
 */

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class Solution {
    public static void main(String[] args) {
        String s = "aabb";
        int i = firstUniqChar(s);
        System.out.println(i);
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i <s.length() ; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
