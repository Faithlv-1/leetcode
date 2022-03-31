package FS;

import strcut.ListNode;
import strcut.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class demo1 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left=t2;
        t1.right=t3;
        t2.right=t5;
        t2.left=t4;
        t4.left=t6;

        System.out.println(BFS(t1));

        return;
    }

    //广度优先算法
    public static int BFS(TreeNode root){
        int maxDepth=0;
        if(root==null)
            return maxDepth;
        Deque<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){
            maxDepth++;
            int length=que.size();
            for(int i=0;i<length;i++){
                //获取队列第一个元素，并将子节点加入队列
                if(que.peek().left!=null)
                    que.add(que.peek().left);
                if(que.peek().right!=null)
                    que.add(que.peek().right);
                que.pop();
            }
        }
        return maxDepth;
    }
    //深度优先算法
    public static int DFS(TreeNode root){
        int maxDepth=0;
        if(root==null)
            return maxDepth;
        maxDepth++;

        return maxDepth;
    }
}
