package com.binarysearchtree;

/**
 * MyBinarySearchTreeAPI class
 * Binary Search Tree methods executed
 */
public class MyBinaryTreeAPI {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree API");
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree();
        binaryTree.addNode(56);
        binaryTree.addNode(30);
        binaryTree.addNode(70);
        binaryTree.addNode(22);
        binaryTree.addNode(40);
        binaryTree.addNode(11);
        binaryTree.addNode(3);
        binaryTree.addNode(16);
        binaryTree.addNode(60);
        binaryTree.addNode(65);
        binaryTree.addNode(63);
        binaryTree.addNode(67);
        binaryTree.addNode(95);
        int size = binaryTree.size;
        System.out.println("Size of Binary tree: " + size);
        binaryTree.printTree();
        Boolean result = binaryTree.searchNode(63);
        System.out.println("63 found in Binary Search Tree: "+result);
    }
}
