import java.util.HashMap;
import java.util.Map;

public class five_three {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        fenzhi(nums,0,nums.length-1);
    }

//    public static int maxSubArray(int[] nums) {
//        int max=nums[0];
//        int now=0;
//        for(int i=0;i<nums.length;i++){
//            now+=nums[i];
//            if(now>max)
//                max=now;
//            //舍弃
//            if(now<0){
//                now=0;
//            }
//        }
//        return max;
//    }

    public static Map<String,Integer> fenzhi(int[] nums,int left,int right){
        //划分到最小
        if(left==right){
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("max",nums[left]);
            return hm;
        }

        //若非边界划分,1.mid=left  2.left<mid<right
        int mid=left+(right-left)/2;
        Map<String,Integer> left_map=fenzhi(nums,left,mid);
        Map<String,Integer> right_map=fenzhi(nums,mid+1,right);
        //获取最大值
        //合并
        Map<String, Integer> map = new HashMap<>();
        map.put("max",maxCrossingSum(nums,left,mid,right));

        System.out.println(Math.max(map.get("max"),Math.max(left_map.get("max"),right_map.get("max"))));
        return map;



    }

    private static int maxCrossingSum(int[] nums, int left, int mid, int right) {
        // 一定会包含 nums[mid] 这个元素
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        // 左半边包含 nums[mid] 元素，最多可以到什么地方
        // 走到最边界，看看最值是什么
        // 计算以 mid 结尾的最大的子数组的和
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        // 右半边不包含 nums[mid] 元素，最多可以到什么地方
        // 计算以 mid+1 开始的最大的子数组的和
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }


}
