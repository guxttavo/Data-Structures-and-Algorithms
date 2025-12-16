package Fundamentals;

public class Binary_Tree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.traverse();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    void traverse() {
        System.out.println(this.val);

        if (this.left != null) {
            this.left.traverse();
        }

        if (this.right != null) {
            this.right.traverse();
        }
    }
}
//pausar e continuar a estudar depois, alto nivel de complexidade

