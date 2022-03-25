import strcut.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class one_four_four {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        return preorderTraversal2(root,ls);
    }

    public static List<Integer> preorderTraversal2(TreeNode root,List<Integer> ls) {
        if(root==null)
            return ls;

        preorderTraversal2(root.left,ls);
        preorderTraversal2(root.right,ls);
        ls.add(root.val);

        return ls;
    }
}
