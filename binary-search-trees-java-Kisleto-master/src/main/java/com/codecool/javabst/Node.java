package com.codecool.javabst;

public class Node {
    public Integer toAdd;
    public Node right, left;

    public Node(Integer key) {
        this.toAdd = key;
        right = null;
        left = null;
    }

    public boolean search(int value) {

        if (value == this.toAdd)

            return true;

        else if (value < this.toAdd) {

            if (left == null)

                return false;

            else

                return left.search(value);

        } else {

            if (right == null)

                return false;

            else

                return right.search(value);

        }


    }

}
