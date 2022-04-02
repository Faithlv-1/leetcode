import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class four_six {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ls = new ArrayList<>();
        ls=permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls_all = new ArrayList<>();
        boolean[] bs = new boolean[nums.length];
        ArrayList<Integer> ls = new ArrayList<>();
        demo(nums,0,ls,ls_all,bs);
        return ls_all;
    }

    //递归找list下可能的
    public static void demo(int[] nums,int depth,List<Integer> ls,List<List<Integer>> ls_all,boolean[] p){
        if(depth==nums.length){
            ls_all.add(new ArrayList<Integer>(ls));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!p[i]){
                ls.add(nums[i]);
                p[i]=true;
                demo(nums,depth+1,ls,ls_all,p);

                //回溯
                p[i]=false;
                ls.remove(ls.size()-1);
            }
        }

    }
}
