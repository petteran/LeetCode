package easy.合并两个有序数组;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：合并两个有序数组
 * 创建时间：2022/1/10 22:23
 * 创 建 人：petteran
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0){return;}
        for (int i = 0; i <n ; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
