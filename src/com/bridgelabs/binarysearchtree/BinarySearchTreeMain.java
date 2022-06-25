package com.bridgelabs.binarysearchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("Binary Search implementations");
        IBinarySearchTree<Integer> binary = new BinarySearchTreeImplementation();

        binary.add(56);
        binary.add(30);
        binary.add(70);
        binary.add(200);
        binary.add(5);
        System.out.println("Size = " + binary.size());
        System.out.println(binary);

    }
}
