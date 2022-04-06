import strcut.TreeNode;

public class one_one_one {
    public static void main(String[] args) {
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t2.right=t3;
        t3.right=t4;
        t4.right=t5;
        t5.right=t6;
        minDepth(t2);
    }

    public static int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null&&root.right==null){
            return 1;
        }
        else if(root.left!=null&&root.right==null){
            return minDepth(root.left)+1;
        }
        else if(root.left==null&&root.right!=null){
            return minDepth(root.right)+1;
        }
        else {
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }
}
