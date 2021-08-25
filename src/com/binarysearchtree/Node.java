package com.binarysearchtree;

/**
 * Node class
 *
 * @param <T>
 */
public class Node<T> {
    public Node<T> left, right;
    public T data;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
