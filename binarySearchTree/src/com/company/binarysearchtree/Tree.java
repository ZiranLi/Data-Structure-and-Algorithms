package com.company.binarysearchtree;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root==null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root!=null) {
            return root.get(value);
        }

        return null;
    }

    public void InorderTraversal() {
        if (root!=null) {
            root.InorderTraversal();
        }
    }
    public void PreOrderTraversal() {
        if (root!=null) {
            root.PreOrderTraveral();
        }
    }

    public void PostOrderTraversal() {
        if (root!=null) {
            root.PostOrderTraveral();
        }
    }

    public int min() {
        if (root==null) {
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    public int max() {
        if (root==null) {
            return Integer.MAX_VALUE;
        }
        return root.max();
    }

    public void delete(int value) {
        root = delete(root, value);

    }

    private TreeNode delete(TreeNode subTreeroot, int value) {
        if (subTreeroot == null) {
            return null;
        }

        if (value < subTreeroot.getData()) {
            subTreeroot.setLeftChild(delete(subTreeroot.getLeftChild(), value));
        }

        if (value > subTreeroot.getData()) {
            subTreeroot.setRightChild(delete(subTreeroot.getRightChild(), value));
        }
        else {
            if (subTreeroot.getLeftChild() == null) {
                return subTreeroot.getRightChild();
            }
            if (subTreeroot.getRightChild() == null ) {
                return subTreeroot.getLeftChild();
            }
            else {
                //replace with the max in left subtree
                //then delete the max node in the left subtree
                subTreeroot.setData(subTreeroot.getLeftChild().max());

                subTreeroot.setLeftChild(delete(subTreeroot.getLeftChild(),subTreeroot.getData()));
            }


        }
        return subTreeroot;

    }


}
