package com.binarysearchtree;

/**
 * Binary Tree
 * @param <T>
 */
public class MyBinaryTree<T extends Comparable<T>> {
    public Node<T> root;
    public int size;

    // checks if tree empty, then adds data to root else adds data to node
    public void addNode(T data) {
        if (size == 0) {
            root = new Node<T>(data);
        } else {
            addNode(root, data);
        }
        size++;
    }

    // adds data to tree node
    public void addNode(Node<T> node, T data) {
        if (data.compareTo(node.data) < 0) {
            if (node.left != null) {
                addNode(node.left, data);
            } else {
                node.left = new Node<T>(data);
                return;
            }
        } else if (data.compareTo(node.data) > 0) {
            if (node.right != null) {
                addNode(node.right, data);
            } else {
                node.right = new Node<T>(data);
                return;
            }
        } else {
            return;
        }
    }

    public int displaySize() {
        System.out.println("Size of the tree is:" + size);
        return size;
    }

    public void printTree() {
        System.out.print("Binary Tree: ");
        if (size == 0) {
            System.out.print("Empty");
        } else {
            System.out.println("\nInOrder: ");
            printInOrder(root);
            System.out.println("\nPostOrder: ");
            printPostOrder(root);
            System.out.println("\nPreOrder: ");
            printPreOrder(root);
        }
        System.out.print("\n");
    }

    private void printInOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(" " + node.data + " ");
        printInOrder(node.right);
    }

    private void printPreOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.data + " ");
        printInOrder(node.left);
        printInOrder(node.right);
    }

    private void printPostOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(" " + node.data + " ");
    }
}
