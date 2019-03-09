package com.codecool.javabst;

import java.util.List;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root;


    public static BinarySearchTree build(List<Integer> elements) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (Integer key: elements) {
            binarySearchTree.add(key);

        }
        return binarySearchTree;
    }

    public boolean search(Integer toFind) {
        if (root == null){
            return false;
        } else {
            return root.search(toFind);
        }
    }


    public void add(Integer toAdd) {
        root = addRecursive(root, toAdd);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.toAdd) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.toAdd) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
    }

}
