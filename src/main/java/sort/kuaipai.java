package sort;

import strcut.ListNode;
import strcut.TreeNode;

import java.util.Stack;

public class kuaipai {
    public static void main(String[] args) {
        int[] nums={66,423,51,34,35,2,35,2,53};
        sort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.println(i);
        }
    }

//    public static int[] sort(int[] array,int left,int right){
//        if(left>=right-1)
//            return array;
//        //
//        int p=left;
//        int q=right;
//        boolean fan=true;
//        int compare=array[left];
//        while (p!=q){
//            if(fan){
//                if(array[q]>=compare){
//                    q--;
//                    continue;
//                }
//                else {
//                    array[p]=array[q];
//                    p++;
//                    fan=false;
//                    continue;
//                }
//            }
//            else {
//                if(array[p]<=compare){
//                    p++;
//                    continue;
//                }
//                else {
//                    array[q]=array[p];
//                    q--;
//                    fan=true;
//                    continue;
//                }
//
//
//            }
//        }
//        array[p]=compare;
//        sort(array,left,p-1);
//        sort(array,p+1,right);
//
//        return array;
//    }
    //快排
//    public static void sort(int[] nums,int left,int right){
//        //什么情况可以不用继续排序
//        if(left>=right)
//            return;
//        Stack<Integer> i = new Stack<>();
//
//        //标准选择nums[left]
//        int temp=nums[left];
//        //p为左指针，q为右指针
//        //flag为true，向右，为false向左
//        boolean flag=true;
//        int p=left;
//        int q=right;
//        while(q!=p){
//            //向右
//            if(flag){
//                if(nums[q]<temp){
//                    nums[p]=nums[q];
//                    p++;
//                    flag=false;
//                    continue;
//                }
//                else {
//                    q--;
//                    continue;
//                }
//            }
//            //向左
//            else {
//                if(nums[p]>temp){
//                    nums[q]=nums[p];
//                    q--;
//                    flag=true;
//                    continue;
//                }
//                else {
//                    p++;
//                    continue;
//                }
//            }
//        }
//        nums[p]=temp;
//
//        sort(nums,left,p-1);
//        sort(nums,p+1,right);
//
//    }

    //
    public static void sort(int[] nums,int left,int right){
        if(left>=right)
            return;

        //排序
        int temp=nums[left];
        int p =left;
        int q=right;
        //开始
        boolean flag = true; //true 往右
        while (p<q){
            //比较的值在右边
            while (nums[q]>temp&&p<q)
                q--;
            nums[p]=nums[q];
            p++;
            //比较的值在左边
            while (nums[p]<temp&&p<q)
                p++;
            nums[q] = nums[p];
            q--;
        }

        //排序结束
        nums[p]=temp;
        sort(nums,left,p-1);
        sort(nums,p+1,right);

    }
}
