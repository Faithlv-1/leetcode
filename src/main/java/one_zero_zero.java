import strcut.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class one_zero_zero {
    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(2);
        TreeNode t5 = new TreeNode(1);
        TreeNode t4 = new TreeNode(1,t5,t6);
        TreeNode t3 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1,t2,t3);


        System.out.println(isSameTree(t1,t4));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        else if(p==null||q==null){
            return false;
        }

        Queue<TreeNode> qu1 = new ArrayDeque<TreeNode>();
        Queue<TreeNode> qu2 = new ArrayDeque<TreeNode>();
        qu1.add(p);
        qu2.add(q);

        while(!qu1.isEmpty()&&!qu2.isEmpty()){
            //
            if(qu1.peek().val==qu2.peek().val){
                if(qu1.peek().left!=null&&qu2.peek().left!=null){
                    qu1.add(qu1.peek().left);
                    qu2.add(qu2.peek().left);


                }
                else if(qu1.peek().left==null&&qu2.peek().left!=null){
                    break;
                }
                else if(qu1.peek().left!=null&&qu2.peek().left==null){
                    break;
                }

                if(qu1.peek().right!=null&&qu2.peek().right!=null){
                    qu1.add(qu1.peek().right);
                    qu2.add(qu2.peek().right);
                }
                else if(qu1.peek().right==null&&qu2.peek().right!=null){
                    break;
                }
                else if(qu1.peek().right!=null&&qu2.peek().right==null){
                    break;
                }
                qu1.poll();
                qu2.poll();

            }
            else
                break;
        }
        if(qu1.isEmpty()&&qu2.isEmpty()){
            return true;
        }
        else
            return false;
    }
}
