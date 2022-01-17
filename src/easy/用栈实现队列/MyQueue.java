package easy.用栈实现队列;

/**
 * 项目名称：LeetCode
 * 类 名 称：MyQueue
 * 类 描 述：用栈实现队列
 * 创建时间：2022/1/17 23:52
 * 创 建 人：petteran
 */

import java.util.Stack;

/**
 *  请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 *         实现 MyQueue 类：
 *             1. void push(int x) 将元素 x 推到队列的末尾
 *             2. int pop() 从队列的开头移除并返回元素
 *             3. int peek() 返回队列开头的元素
 *             4. boolean empty() 如果队列为空，返回 true ；否则，返回 false
 *         说明:
 *             1. 你只能使用标准的栈操作 —— 也就是只有push to top,peek/pop from top,size, 和is empty操作是合法的。
 *             2. 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 *         进阶:
 *             1. 你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，
 *         即使其中一个操作可能花费较长时间。
 */

class MyQueue {
    private Stack<Integer> s1,s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * 添加元素到队尾
     * @param x
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * 删除队头的元素并返回
     * @return
     */
    public int pop() {
        peek();
        return s2.pop();
    }

    /**
     * 返回队头元素
     * @return
     */
    public int peek() {
        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */