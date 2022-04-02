public class five_five {
    public static void main(String[] args) {
        int[] nums={2,0,0,0,4};
        System.out.println(canJump(nums));
        System.out.println("ss");
    }

    public static boolean canJump(int[] nums) {

//        //当前位置
//        int pla=0;
//        while(pla<nums.length-1){
//            //判断当前位置是否为0
//            if(nums[pla]==0){
//                boolean flag=false;
//                //往前找看是否能跨过去
//                for (int i = pla-1; i >=0 ; i--) {
//                    //能跨过
//                    if(i+nums[i]>pla){
//                        flag=true;
//                        break;
//                    }
//                }
//                //
//                if(flag){
//                    pla++;
//                    continue;
//                }
//                else
//                    return false;
//            }
//            //当前不为0
//            //获取当前位置最大能往前跳的步
//            int max=nums[pla];
//            //往后跳
//            pla=pla+max;
//        }
//
//        //退出循环
//        //1.跳到最后或超过
//        //2.跨不过0，失败
//        if(pla<nums.length-1){
//            return false;
//        }
//        else
//            return true;

        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max)
                return false;
            else
                max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}
