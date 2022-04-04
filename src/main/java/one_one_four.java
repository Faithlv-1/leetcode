import strcut.TreeNode;

import java.util.Stack;

public class one_one_four {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        //获取栈
        flatten2(root,stack);
        TreeNode last=null;
        while (!stack.isEmpty()){
            TreeNode now = stack.pop();
            now.right=last;
            now.left=null;
            last=now;
        }
    }

    //先序遍历加入栈
    public static void flatten2(TreeNode root, Stack<TreeNode> stack) {
        if(root==null)
            return;
        //
        stack.add(root);
        flatten2(root.left,stack);
        flatten2(root.right,stack);
    }


}
