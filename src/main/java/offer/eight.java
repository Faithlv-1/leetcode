package offer;

public class eight {
    public static void main(String[] args) {
        minSubArrayLen(4,new int[]{1,4,4});
    }
    //滑动窗口
    public static int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;

        //计算最小窗口长度
        int left=0;
        int right=0;
        int count=nums[0];

        while (true){
            //小于
            if(count<target){
                if(right<nums.length-1){
                    right++;
                    count+=nums[right];
                }
                else
                    break;
            }

            //大于
            else{
                //记录
                min = right-left+1<min?right-left+1:min;
                if(left==right)
                    return min;
                else {
                    count-=nums[left];
                    left--;
                }
            }
        }

        if(min==nums.length+1)
            return 0;
        else
            return min;
    }

}
