package com.codecool.javabst;

import java.util.List;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(int key) {
        this.root = new Node(key);
    }

    public Node find(int key){
        return this.root.find(key);
    }

    public static BinarySearchTree build(List<Integer> elements) {
        // TODO construct a binary search tree here
        for (Integer key: elements) {
            BinarySearchTree.add(key);

        }
        return BinarySearchTree
    }

    public boolean search(Integer toFind) {
        // TODO return true if the element has been found, false if its not in the tree.
        return false;
    }

    public static void add(Integer toAdd) {
        Node n = this.find(toAdd);
        if (toAdd < n.toAdd) {
            n.left = new Node(toAdd);
            n.left.p = n;
        }
        else if (toAdd > n.toAdd) {
            n.right = new Node(toAdd);
            n.right.p = n;
        }
    }

    }

    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
    }

}
