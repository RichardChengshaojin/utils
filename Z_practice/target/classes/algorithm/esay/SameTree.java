package algorithm.esay;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * <p>
 * <p>解析：
 * 同时遍历两棵树，判断其是否相等即可
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/22.
 */
public class SameTree {

    public static void main(String[] args) {
//        TreeNode t = new TreeNode(1);
//        TreeNode t1 = new TreeNode(2);
//        TreeNode t2 = new TreeNode(3);
//        TreeNode t3 = new TreeNode(4);
//        TreeNode t4 = new TreeNode(5);
//        t.left = t1;
//        t.right = t2;
//        t.left.right = t3;
//        t.right.left = t4;
        SameTree s = new SameTree();
//        s.preorderVisit(t);
        long product = 1;
        for (int i = 2; i <= 10; i++) {
            product *= i;
        }
        System.out.println(product);
        System.out.println(s.factorial(10));
        System.out.println(s.fibonacci(3));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        }
        if (null == p || null == q) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    private void preorderVisit(TreeNode tree) {
        if (null != tree) {
            System.out.println(tree.val);
            preorderVisit(tree.left);
            preorderVisit(tree.right);
        }
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
