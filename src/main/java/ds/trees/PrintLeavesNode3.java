package ds.trees;

import java.util.TreeMap;

public class PrintLeavesNode3 {
    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println(
                "Bottom view of the given binary tree:");

        printLeaveNode(root);
    }

    static void printLeaveNode(Node root) {

        if (root == null) {
            return;
        }
        printLeaveNode(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.key + " ");
        }
        printLeaveNode(root.right);
    }
}
