public class kuaipai {
    public static void main(String[] args) {
        int[] nums={1,3,2,9,45,3,24,545,234};
        kp(nums,0,nums.length-1);


    }
    public static void kp(int[] nums,int first,int end){
        if(first<end){
            int num=nums[first];
            int i=first;
            int j=end;
            while(i<j){
                while(i<j&&nums[j]>num)
                    j--;
                if(i<j)
                    nums[i++]=nums[j];
                while(i<j&&nums[i]<num)
                    i++;
                if(i<j)
                    nums[j--]=nums[i];
            }
            nums[i]=num;
            kp(nums,first,i-1);
            kp(nums,i+1,end);
        }

    }
}
