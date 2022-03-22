import strcut.TreeNode;

import java.util.ArrayList;

public class one_zero_four {
    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t4 = new TreeNode(1,t5,t6);
        TreeNode t3 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1,t2,t3);

        System.out.println(maxDepth(t1));
    }

    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        ArrayList<Integer> ig = new ArrayList<>();
        ig.add(0,0);  //变量0表示当前层
        ig.add(1,0); //变量1表示当前递归最大层
        maxDepth2(root,ig);
        return ig.get(1);
    }

    public static void maxDepth2(TreeNode root,ArrayList<Integer> ig){
        //当前节点为空
        if(root==null){
            return;
        }
        //当前节点不为空
        int now = ig.get(0)+1;
        ig.set(0,now);
        if(ig.get(1)<now){
            ig.set(1,now);
        }

        //
        maxDepth2(root.left,ig);
        maxDepth2(root.right,ig);

        //这里表示，该节点以下全部遍历，返回时层数减一，为上层对应的层数
        ig.set(0,now-1);
        return;

    }
}
