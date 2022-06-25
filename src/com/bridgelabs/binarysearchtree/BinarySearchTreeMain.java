package com.bridgelabs.binarysearchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("Binary Search implementations");
        IBinarySearchTree<Integer> binary = new BinarySearchTreeImplementation();

        binary.add(56);
        binary.add(30);
        binary.add(70);

        System.out.println(binary);

    }
}
