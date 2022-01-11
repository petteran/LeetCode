package easy.买卖股票的最佳时机;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：买卖股票的最佳时机
 * 创建时间：2022/1/11 23:46
 * 创 建 人：petteran
 */

/**
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int i = maxProfit(nums);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
