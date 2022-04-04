package sort;

public class charu {
    public static void main(String[] args) {
        int[] nums={66,423,51,34,35,2,35,2,53};
        sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }

    //插入排序
    //默认第一个排序，往后选将其插入有序数组

    public static void sort(int[] nums){
        int n = nums.length;
        if(n==1)
            return;
        //插入n-1次
        //比较有序数组长度次数
        int length = 1;//有序数组的长度
        for (int i = 1; i < n; i++) {
            int cha = nums[i];
            //比较最后一个数字
            if(nums[i]>nums[length-1]){
                //将下标length 到i-1 往后移动一位
                for(int m=i-1;m>=length;m--){
                    nums[m+1] = nums[m];
                }
                nums[length]=cha;
                length++;
                continue;
            }

            //num[i] 是当前需要插入的数字
            //和数组内比较
            for (int j = 0; j < length; j++) {
                if(cha<nums[j]){
                    //将下标j 到i-1 往后移动一位
                    for(int m=i-1;m>=j;m--){
                        nums[m+1] = nums[m];
                    }
                    nums[j]=cha;
                    length++;
                    break;
                }
            }


        }
    }


}
