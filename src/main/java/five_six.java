import java.util.ArrayList;
import java.util.List;

public class five_six {
    public static void main(String[] args) {
        int[][] nums={{1,45},{1,2},{2,4},{2,3}};
        merge(nums);
    }

    public static int[][] merge(int[][] intervals) {
        //给数组排序
        //首先根据第1个元素大小排，相同则根据第二元素
        sort(intervals);
        //合并
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        int first=intervals[0][0];
        int last=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=last){
                last=Math.max(intervals[i][1],last);
                continue;
            }
            else{
                List<Integer> ls2 = new ArrayList<>();
                ls2.add(first);
                ls2.add(last);
                ls.add(ls2);
                first=intervals[i][0];
                last=intervals[i][1];
                continue;
            }
        }
        List<Integer> ls2 = new ArrayList<>();
        ls2.add(first);
        ls2.add(last);
        ls.add(ls2);

        int[][] res=new int[ls.size()][2];
        for(int i=0;i<res.length;i++){
            for (int j = 0; j < 2; j++) {
                res[i][j]=ls.get(i).get(j);
            }
        }

        return res;

    }

    public static void sort(int[][] nums){
        for(int i=0;i<nums.length-1;i++){
            for (int j = 0; j <nums.length-1-i; j++) {
                //第一个元素不同
                if(nums[j][0]>nums[j+1][0]){
                    //交换
                    int temp0=nums[j][0];
                    int temp1=nums[j][1];
                    nums[j][0]=nums[j+1][0];
                    nums[j][1]=nums[j+1][1];
                    nums[j+1][0]=temp0;
                    nums[j+1][1]=temp1;
                }
                //第一个元素相同
                else if(nums[j][0]==nums[j+1][0]){
                    if(nums[j][1]>nums[j+1][1]){
                        //交换
                        int temp0=nums[j][0];
                        int temp1=nums[j][1];
                        nums[j][0]=nums[j+1][0];
                        nums[j][1]=nums[j+1][1];
                        nums[j+1][0]=temp0;
                        nums[j+1][1]=temp1;
                    }
                }
            }
        }
    }
}
