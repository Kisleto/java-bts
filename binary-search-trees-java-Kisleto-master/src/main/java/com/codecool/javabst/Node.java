package com.codecool.javabst;

public class Node {
    public Integer key;
    public Node right, left;

    public Node(Integer key) {
        this.key = key;
        right = null;
        left = null;
    }

    public boolean search(int value) {

        if (value == this.key) {
            return true;
        } else if (value < this.key) {

            if (left == null) {
                return false;
            } else {
                return left.search(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.search(value);
            }
        }


    }
}

