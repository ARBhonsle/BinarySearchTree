package com.binarysearchtree;

/**
 * MyBinarySearchTreeAPI class
 * Binary Search Tree methods executed
 */
public class MyBinaryTreeAPI {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree API");
        MyBinaryTree<Integer> binaryTree =new MyBinaryTree();
        binaryTree.addNode(56);
        binaryTree.addNode(30);
        binaryTree.addNode(70);
        int size = binaryTree.size;
        System.out.println("Size of Binary tree: "+size);
        binaryTree.printTree();
    }
}
