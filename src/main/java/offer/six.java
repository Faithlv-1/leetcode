package offer;

import java.io.FilterWriter;

public class six {
    public static void main(String[] args) {

    }

//    public int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        for (int i = numbers.length-1; i >0 ; i--) {
//            int right=numbers[i];
//            for (int j = i-1; j >=0 ; j--) {
//                int left=numbers[j];
//                if(left+right==target){
//
//                    res[0]=j;
//                    res[1]=i;
//                    return res;
//                }
//                else if(left+right<target)
//                    break;
//                else
//                    continue;
//            }
//        }
//
//        return res;
//    }
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right =numbers.length-1;
        while (left<right){
            int leftNum=numbers[left];
            int rightNum=numbers[right];
            if(leftNum+rightNum==target){
                res[0]=left;
                res[1]=right;
                return res;
            }
            else if(leftNum+rightNum>target){
                right--;
            }
            else if(leftNum+rightNum<target){
                left++;
                }
        }

        return res;
    }
}
