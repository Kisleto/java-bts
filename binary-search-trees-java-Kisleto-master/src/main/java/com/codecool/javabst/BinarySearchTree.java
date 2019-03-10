package com.codecool.javabst;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root = new Node(53);


    public static BinarySearchTree build(@NotNull List<Integer> elements) {
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

        if (value < current.key) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.key) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
        root = deleteNode(root, toRemove);
    }
    Node deleteNode(Node root, Integer key){
        if (root == null) throw new NoSuchElementException();

        if(key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key){
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

}
