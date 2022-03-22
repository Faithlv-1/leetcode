import strcut.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nine_four {

    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3,t5,t6);
        TreeNode t2 = new TreeNode(2,t4,null);
        TreeNode t1 = new TreeNode(1,t2,t3);
        List<Integer> il = new ArrayList<Integer>();
        il =inorderTraversal(t1);
        for(int i:il){
            System.out.println(i);
        }
        System.out.println("asd");
    }

//    public static List<Integer> inorderTraversal(TreeNode root,List<Integer> il) {
//        if(root==null)
//            return il;
//        inorderTraversal(root.left,il);
//        il.add(root.val);
//        inorderTraversal(root.right,il);
//
//        return il;
//    }

//    public static List<Integer> inorderTraversal2(TreeNode root) {
//        if(root==null)
//            return il;
//        inorderTraversal(root.left,il);
//        il.add(root.val);
//        inorderTraversal(root.right,il);
//
//        return il;
//    }


//    //中序遍历
//    public static List<Integer> inorderTraversal(TreeNode root){
//        Stack<TreeNode> st = new Stack<>();
//        ArrayList<Integer> il = new ArrayList<>();
//
//        while(root!=null||!st.isEmpty()){
//            if(root==null){
//                il.add(st.peek().val);
//                root=st.peek().right;
//                st.pop();
//                continue;
//            }
//            st.push(root);
//            root=root.left;
//        }
//
//        return il;
//    }

//    //前序遍历
//    public static List<Integer> inorderTraversal(TreeNode root){
//        Stack<TreeNode> st = new Stack<>();
//        ArrayList<Integer> il = new ArrayList<>();
//
//        while (root!=null||!st.empty()){
//            if(root!=null){
//                il.add(root.val);
//                st.push(root);
//                root=root.left;
//            }
//            else{
//                root=st.peek().right;
//                st.pop();
//            }
//        }

        //后序遍历
        public static List<Integer> inorderTraversal(TreeNode root){
            Stack<TreeNode> st = new Stack<>();
            ArrayList<Integer> il = new ArrayList<>();

            while (root!=null||!st.empty()){
                if(root!=null){
                    st.push(root);

                }
                else{
                    root=st.peek().right;
                    st.pop();
                }
            }


        return il;
    }
}
