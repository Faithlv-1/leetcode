public class one_one {
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        maxArea(nums);
    }

    public static int maxArea(int[] height) {
        if(height.length<=1)
            return 0;
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left!=right){
            int s=(right-left)*Math.min(height[left],height[right]);
            if(max<s)
                max=s;
            if(height[left]>height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}
