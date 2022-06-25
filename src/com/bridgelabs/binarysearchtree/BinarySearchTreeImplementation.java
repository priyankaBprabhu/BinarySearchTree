package com.bridgelabs.binarysearchtree;

public class BinarySearchTreeImplementation<K extends Comparable> implements IBinarySearchTree<K>{
    private Node<K> root;

    @Override
    public void add(K key) {
        root = addRecursively(root, key);

    }

    private Node<K> addRecursively(Node<K> current, K key) {
        if (current == null)
            return new Node<>(key);

        int compareResult = key.compareTo(current.key);

        if (compareResult == 0) {
            return current;
        } else if (compareResult > 0) {
            current.right = addRecursively(current.right, key);
        } else {
            current.left = addRecursively(current.left, key);
        }
        return current;
    }

    @Override
    public String toString() {
        return "BinarySearchTreeImplementation{" +
                "root=" + root +
                '}';
    }
}
