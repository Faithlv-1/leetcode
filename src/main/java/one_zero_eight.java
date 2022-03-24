import strcut.TreeNode;

public class one_zero_eight {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        TreeNode root = new TreeNode();
        root=sortedArrayToBST(nums);
        System.out.println(root.left.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        sortedArrayToBST2(0,nums.length-1,root,nums);
        return root;
    }

    public static void sortedArrayToBST2(int left,int right,TreeNode node,int[] nums){
        //
        if(left==right){
            node.val=nums[left];
            return;
        }
        //
        int mid=(left+right)/2;
        node.val=nums[mid];

        if(left<=mid-1){
            TreeNode leftNode = new TreeNode();
            node.left=leftNode;
            sortedArrayToBST2(left,mid-1,leftNode,nums);
        }
        if(mid+1<=right){
            TreeNode rightNode = new TreeNode();
            node.right=rightNode;
            sortedArrayToBST2(mid+1,right,rightNode,nums);
        }

        return;
    }
}
