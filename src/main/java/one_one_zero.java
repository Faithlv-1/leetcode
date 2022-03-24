import strcut.TreeNode;

import java.nio.file.FileStore;

public class one_one_zero {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return isBalanced2(root,true);
    }

    //判断该节点左右子树高度差是否大于一
    public static boolean isBalanced2(TreeNode root,boolean flag){
        if(flag==false)
            return flag;
        int left_high=highCount(root.left);
        int right_high=highCount(root.right);
        if(left_high-right_high>1||right_high-left_high>1){
            flag= false;
            return flag;
        }

        if(root.left!=null){
            flag=isBalanced2(root.left,flag);
            if(flag==false)
                return flag;
        }
        if(root.right!=null){
            flag=isBalanced2(root.right,flag);
            if(flag==false)
                return flag;
        }

        return flag;
    }

    //计算该节点的的高度
    public static int highCount(TreeNode root){
        int left;
        int right;
        int max;

        if(root==null)
            return 0;
        else {
            left=highCount(root.left);
            right=highCount(root.right);
            max = left>right?left:right;
            return max+1;
        }

    }

}
