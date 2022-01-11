package easy.两个数组的交集;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：两个数组的交集
 * 创建时间：2022/1/11 21:25
 * 创 建 人：petteran
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
 *
 */

public class Solution {
    public static void main(String[] args) {
        int[] nums1= {1,2,2,1};
        int[] nums2={2,2};
        int[] intersect = intersect(nums1, nums2);
        Arrays.stream(intersect).forEach(System.out::println);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            int count = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], count);
        }
        int [] arr = new int[len1];
        int index = 0;
        for (int i = 0; i < len2; i++) {
            int count =  map.getOrDefault(nums2[i],0);
            if (count > 0) {
                arr[index++]=nums2[i];
                count--;
                if (count > 0) {
                    map.put(nums2[i], count);
                }else {
                    map.remove(nums2[i]);
                }
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }
}
