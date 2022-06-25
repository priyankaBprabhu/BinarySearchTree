package com.bridgelabs.binarysearchtree;

public class Node<K>{
    K key;
    Node<K> left;
    Node<K> right;

    public Node(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
