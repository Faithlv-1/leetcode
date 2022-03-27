package sort;

public class kuaipai {
    public static void main(String[] args) {
        int[] nums={66,423,51,34,35,2,35,2,53};
        sort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.println(i);
        }
    }

    public static int[] sort(int[] array,int left,int right){
        if(left>=right-1)
            return array;
        //
        int p=left;
        int q=right;
        boolean fan=true;
        int compare=array[left];
        while (p!=q){
            if(fan){
                if(array[q]>=compare){
                    q--;
                    continue;
                }
                else {
                    array[p]=array[q];
                    p++;
                    fan=false;
                    continue;
                }
            }
            else {
                if(array[p]<=compare){
                    p++;
                    continue;
                }
                else {
                    array[q]=array[p];
                    q--;
                    fan=true;
                    continue;
                }


            }
        }
        array[p]=compare;
        sort(array,left,p-1);
        sort(array,p+1,right);

        return array;
    }
}
