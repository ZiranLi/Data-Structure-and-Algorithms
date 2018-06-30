package com.company.binarysearchtree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value== data){
            return;
        }

        if(value< data){
            if(leftChild==null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild==null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if (value==data) {
            return this;
        }

        if (value<data) {
            if (leftChild!=null) {
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild!=null) {
                return rightChild.get(value);
            }
        }

        return null;
    }


    public void InorderTraversal() {
        //left
        if (leftChild!=null) {
            leftChild.InorderTraversal();
        }
        //root
        System.out.print(data+",");
        //right
        if (rightChild!=null) {
            rightChild.InorderTraversal();
        }

    }

    public void PreOrderTraveral() {
        //root
        System.out.print(data+",");
        //left
        if (leftChild!=null) {
            leftChild.PreOrderTraveral();
        }
        //right
        if (rightChild!=null) {
            rightChild.PreOrderTraveral();
        }
    }

    public void PostOrderTraveral() {

        if (leftChild!=null) {
            leftChild.PostOrderTraveral();
        }

        if (rightChild!=null) {
            rightChild.PostOrderTraveral();
        }

        System.out.print(data+",");

    }


    public int min() {
        if (leftChild==null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild==null) {
            return data;
        }
        return rightChild.max();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }




}
