package ds.trees;

import java.util.LinkedList;
import java.util.TreeMap;

public class BottomView3 {
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

    public static void bottomView(Node root, int hd, int level, TreeMap<Integer, int[]> m) {
        if (root == null) {
            return;
        }
        if (!m.containsKey(hd)) {
            m.put(hd, new int[]{root.key, level});
        } else {
            int[] p = m.get(hd);
            if (p[1] <= level) {
                p[1] = level;
                p[0] = root.key;
            }
            m.put(hd, p);
        }
        bottomView(root.left, hd - 1, level + 1, m);
        bottomView(root.right, hd + 1, level + 1, m);
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

        printBottomView(root);
    }

    static void printBottomView(Node root) {

        // Map to store Horizontal Distance,
        // Height and Data.
        TreeMap<Integer, int[]> m = new TreeMap<>();

        bottomView(root, 0, 0, m);

        // Prints the values stored by printBottomViewUtil()
        System.out.println(m + " ");
        for (int[] n : m.values()) {
            System.out.print(n[0] + " ");
        }
    }
}
