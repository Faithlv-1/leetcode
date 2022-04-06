import strcut.TreeNode;

public class one_one_two {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum2(root,targetSum,0);
    }

    public boolean hasPathSum2(TreeNode root, int targetSum,int count){
        if(root==null)
            return false;
        else if(root.left==null&&root.right==null){
            count+=root.val;
            return (count==targetSum);
        }
        else if(root.left!=null&&root.right==null){
            count+=root.val;
            return hasPathSum2(root.left,targetSum,count);
        }
        else if(root.left==null&&root.right!=null){
            count+=root.val;
            return hasPathSum2(root.right,targetSum,count);
        }
        count+=root.val;
        boolean left = hasPathSum2(root.left,targetSum,count);
        boolean right = hasPathSum2(root.right,targetSum,count);
        return (left||right);
    }
}
