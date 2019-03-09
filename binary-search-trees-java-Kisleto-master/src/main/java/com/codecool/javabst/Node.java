package com.codecool.javabst;

public class Node {
    public Integer toAdd;
    public Node p, right, left;

    public Node(Integer key) {
        this.toAdd = key;
        this.p = this.left = this.right = null;
    }

    public Node find(Integer key) {
        if (key < this.toAdd && this.left != null) return this.left.find(key);
        else if (key > this.toAdd && this.right != null) return this.right.find(key);
        else return this;
    }
}
