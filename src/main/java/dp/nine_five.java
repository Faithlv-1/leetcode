package dp;

import com.sun.source.tree.Tree;
import strcut.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class nine_five {
    public static void main(String[] args) {
        generateTrees(3);
    }

    //
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> last = new ArrayList<>();
        if(n==0)
            return last;
        TreeNode t1 = new TreeNode(1);
        last.add(t1);

        for (int i = 2; i <n+1 ; i++) {
            List<TreeNode> now = new ArrayList<>();
            //获取上个i的全部树
            for (TreeNode node:last){
                //i作为头节点的树
                TreeNode head = new TreeNode(i);
                head.left=node;
                now.add(head);
                //i不作为头节的树
                TreeNode p =node;
                int count=0;
                while(p!=null){

                    TreeNode Binsert =copy(node);
                    TreeNode Bhead=Binsert;
                    TreeNode insert = new TreeNode(i);
                    //被插入树往右下移动count次
                    for (int j = 0; j < count; j++) {
                        Binsert=Binsert.right;
                    }
                    //插入
                    insert.left=Binsert.right;
                    Binsert.right=insert;

                    //更新下次插入的位置
                    p=p.right;
                    count++;
                    //加入now
                    now.add(Bhead);
                }

            }
            last.clear();
            last=now;
        }
        return last;
    }


    public static TreeNode copy(TreeNode root){
        //拷贝当前节点
        if(root==null)
            return null;
        TreeNode node = new TreeNode(root.val);
        node.left=copy(root.left);
        node.right=copy(root.right);

        return node;
    }
}
