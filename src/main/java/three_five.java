import java.awt.font.NumericShaper;

public class three_five {
    public static void main(String[] args) {
        int[] nums= {1,2,3,5,6,7};
        System.out.println(searchInsert(nums,4));
    }
    public static int searchInsert(int[] nums, int target) {
        int front=0;
        int end =nums.length-1;
        int mid=(front+end)/2;
        if(target<=nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        while (mid!=front){
            //大于中间节点
            if(target>nums[mid]){
                front=mid;
                mid=(front+end)/2;
            }
            //小于中间节点
            else if(target<nums[mid]){
                end=mid;
                mid=(front+end)/2;
            }
            else if(target==nums[mid]){
                return mid;
            }
        }

        return end;

    }
}
