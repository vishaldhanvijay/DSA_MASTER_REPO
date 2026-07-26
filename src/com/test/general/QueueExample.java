package com.test.general;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue); // [10, 20, 30]

        // peek()
        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println(queue); // [10, 20, 30]

        // poll()
        System.out.println("Poll: " + queue.poll()); // 10
        System.out.println(queue); // [20, 30]
    }
}