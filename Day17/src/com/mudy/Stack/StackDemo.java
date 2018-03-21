package com.mudy.Stack;

import java.util.Stack;

/**
 * Created by mudy on 18/3/21.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");
        s.push("F");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search("B"));
    }

}


/**
 * stack表示先进后出(filo)的对象栈
 * s.peek() 查看栈顶元素
 * s.push() 压栈
 * s.pop() 出栈，移除并返回栈顶元素
 * s.search("B") 返回对象在栈中国呢的位置，以1为基数。
 * 官方建议，使用栈尽量使用ArrayDeque
 */
