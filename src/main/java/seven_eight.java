import java.util.ArrayList;
import java.util.List;

public class seven_eight {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> now = new ArrayList<>();
        subsets(nums,0,res,now);
        return res;
    }

    //回溯
    //每次可分为两个方向
    //是否含有当前num[p]的值，直到p=num.length结束
    public static void subsets(int[] nums,int p,List<List<Integer>> res,List<Integer> now){
        //全部数字都遍历完
        if(p== nums.length){
            res.add(now);
            return;
        }
        //含有当前
        List<Integer> yes = new ArrayList<>(now);
        yes.add(nums[p]);
        subsets(nums,p+1,res,yes);
        //不含有当前
        List<Integer> no = new ArrayList<>(now);
        subsets(nums,p+1,res,no);

    }
}
