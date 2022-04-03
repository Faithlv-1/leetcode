import strcut.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class nine_eight {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(-1);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(-1);
        TreeNode t6 = new TreeNode(6);
        t5.right=t4;
        t4.left=t3;
//        isValidBST(t5);
    }

//    public static boolean isValidBST(TreeNode root) {
//        boolean[] p = new boolean[1];
//        p[0]=true;
//        treeMax(root,p);
//        return p[0];
//    }
//
//    //获取该节点左右子树的最大值,返回值为该节点及其下子节点的最大值
//    public static int[] treeMax(TreeNode root,boolean[] p){
//        //退出条件
//        if(root.left==null&&root.right==null){
//            int[] res = new int[2];
//            res[0]=res[1]=root.val;
//            return res;
//        }
//        else if(root.left!=null&&root.right==null){
//            //往左走
//            int[] left=treeMax(root.left,p);
//            //判断该节点左子树有无问题
//            if(!p[0])
//                return null;
//            if(left[1]>=root.val){
//                p[0]=false;
//            }
//            left[1]=root.val;
//            return left;
//        }
//        else if(root.left==null&&root.right!=null){
//            //往右走
//            int[] right=treeMax(root.right,p);
//            //判断该节点有子树有无问题
//            if(!p[0])
//                return null;
//            if(right[0]<=root.val){
//                p[0]=false;
//            }
//            right[0]=root.val;
//            return right;
//        }
//        else{
//            //往左走
//            int[] left=treeMax(root.left,p);
//            //判断该节点左子树有无问题
//            if(!p[0])
//                return null;
//            //往右走
//            int[] right=treeMax(root.right,p);
//            //判断该节点右边是否有问题
//            if(!p[0])
//                return null;
//            //判断是否符合搜索树结构
//            if(left[1]>=root.val||right[0]<=root.val){
//                p[0]=false;
//            }
//            left[1]=right[1];
//            return left;
//        }
//    }


    public boolean isValidBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        isValidBST2(root,ls);
        for (int i = 0; i < ls.size() - 1; i++) {
            if(ls.get(i)>=ls.get(i+1))
                return false;
        }
        return true;
    }

    //中序遍历
    //左中右
    public void isValidBST2(TreeNode root, List<Integer> ls) {

        //返回条件
        if(root==null)
            return;

        //往左走
        isValidBST2(root.left,ls);
        ls.add(root.val);
        isValidBST2(root.right,ls);
        return;
    }


}
