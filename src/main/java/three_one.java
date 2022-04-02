import java.util.Arrays;

public class three_one {
    public static void main(String[] args) {
        int[] nums={1,5,1};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        //从后往前找
        // 若全是升序，则反转即可，注意第一位置不能为0
        // 后往前找记录最大值，并且记录每位数字遇到的位置，
        // 若遇到当前位置小于最大值，将遇到数字中大于当前值最少的交换，并将该位后排序
        boolean flag =false;//是否有交换的标志

        //从倒数第二开始
        for(int i=nums.length-2;i>=0;i--){
            //当前小于后面
            if(nums[i]<nums[i+1]){
                //找到大于当前1或者大于最少的
                int place=-1;
                int min=nums[i+1];
                for(int j=i+1;j< nums.length;j++){
                    if(nums[j]==nums[i]+1){
                        min=nums[j];
                        place=j;
                        break;
                    }
                    if(nums[j]<=min&&nums[j]>nums[i]){
                        min=nums[j];
                        place=j;
                    }
                }

                int temp=nums[place];
                nums[place]=nums[i];
                nums[i]=temp;
                //i以后排序
                Arrays.sort(nums,i+1,nums.length);
                flag=true;
                break;
            }
        }

        //判断是否进行排序，若无则倒
        if(flag==false){
             for(int i=0,j=nums.length-1;i<j;i++,j--){
                 int temp=nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
             }

             //判断是否将0换到前面
            if(nums[0]==0){
                int i=1;
                while (nums[i]==0){
                    i++;
                }
                nums[0]=nums[i];
                nums[i]=0;
            }
        }

    }
}
