package com.jackie.algo.geek.time.chapter8_stack;

/**
 * @Author: Jackie
 */
public class Stack {

    private Node top = null;

    /**
     * 压栈
     * @see com.jackie.algo.geek.time.chapter6_linkedlist.LinkedList 中的insertToHead方法和这里的push思想类似
     */
    public void push(int value) {
        Node node = new Node(value, null);

        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    /**
     * 出栈
     */
    public int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.value;
        top = top.next;

        return value;
    }

    public void printAll() {
        Node p = top;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static class Node {
        private int value;

        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
