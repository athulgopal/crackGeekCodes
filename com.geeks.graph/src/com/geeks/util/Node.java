package com.geeks.util;

/**
 * Created by wipro on 7/17/17.
 */
public class Node {
    private Node left;
    private Node right;
    private int data;

    public Node(int data){
        this.data=data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}