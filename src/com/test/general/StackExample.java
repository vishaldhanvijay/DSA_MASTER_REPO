package com.test.general;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); // [10, 20, 30]

        // peek()
        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println(stack); // [10, 20, 30]

        // pop()
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println(stack); // [10, 20]
    }
}
