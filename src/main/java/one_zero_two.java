import strcut.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class one_zero_two {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lsAll = new ArrayList<>();
        if(root==null)
            return lsAll;
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        //队列中全部节点为一层
        //将全部节点加入list，并出队列
        //将出的节点的子节点加入队列
        while (!que.isEmpty()){
            int size= que.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node=que.poll();
                if(node.left!=null)
                    que.add(node.left);
                if(node.right!=null)
                    que.add(node.right);
                ls.add(node.val);
            }
            lsAll.add(ls);
        }
        return lsAll;
    }
}
