public class three_four {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        searchRange(nums,target);
    }

    public static int[] searchRange(int[] nums, int target) {

        int pla=-1;
        int[] res={-1,-1};
        if(nums.length==0||target>nums[nums.length-1]||target<nums[0])
            return res;

        pla=searchRange2(nums,target,0,nums.length-1,pla);
        //
        if(pla!=-1){
            int i=pla;
            int j=pla;
            while (i>=0&&nums[i]==nums[pla])
                i--;
            while (j<nums.length&&nums[j]==nums[pla])
                j++;
            res[0]=i+1;
            res[1]=j-1;
        }
        return res;
    }

    public static int searchRange2(int[] nums, int target,int left,int right,int pla) {
        // 终止条件
        if(left==right){
            if(nums[left]==target)
                pla=left;
            return pla;
        }
        // 边界情况，mid==left,且left=right-1,或者left<mid<right
        int mid = left+(right-left)/2;
        //
        if(nums[mid]==target){
            pla=mid;
            return pla;
        }
        else if(nums[mid]<target){
            pla = searchRange2(nums,target,mid+1,right,pla);
            return pla;
        }

        else if(nums[mid]>target){
            pla = searchRange2(nums,target,left,mid,pla);
            return pla;
        }

        return pla;

    }
}
