package sort;

public class guibin {
    public static void main(String[] args) {
        int[] nums={2,3,342,13,23,412};
        int[] now=new int[nums.length];
        sort(nums,now,0,nums.length-1);
        for (int i:now){
            System.out.println(i);
        }
    }

    //分割
    public static int[] sort(int[] nums,int[] now,int left,int right){
        if(left>=right)
            return now;
        int mid=(right-left)/2+left;
        sort(nums,now,left,mid);
        sort(nums,now,mid+1,right);
        merge(nums,now,left,mid,mid+1,right);
        return now;
    }

    //合并
    public static void merge(int[] nums,int[] now,int left1,int right1,int left2,int right2){
        //长度区间是 left1--right2
        //p为插入指针
        int p=left1;
        //p1为1的指针
        int p1=left1;
        //
        int p2=left2;

        while(p1<=right1||p2<=right2){
            if(nums[p1]>nums[p2]||p1>right1){
                now[p++]=nums[p2++];
            }
            else if(nums[p1]<=nums[p2]||p2>right2)
                now[p++]=nums[p1++];
        }
    }
}
