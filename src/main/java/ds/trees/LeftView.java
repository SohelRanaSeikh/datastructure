package ds.trees;

public class LeftView {
    static int max_level = 0;

    public static void leftviewOfTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (max_level < level) {
            System.out.print(root.key + " ");
            max_level = level;
        }
        leftviewOfTree(root.left, level + 1);
        leftviewOfTree(root.right, level + 1);
    }

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        preorder(node.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        System.out.println(
                "Bottom view of the given binary tree:");

        leftviewOfTree(root, 1);
    }

}
