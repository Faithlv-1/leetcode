public class eight_eight {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        for (int i = 0; i <nums1.length ; i++) {
            System.out.println(nums1[i]);

        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for (int i = 0; i <n ; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }
        int find_way=0;
        for (int i = 0; i < n; i++) {
            //如果直接大于等于数组1的最大直接插入在最后面
            if(nums2[i]>=nums1[m-1]){
                nums1[m]=nums2[i];
                m++;
                continue;
            }
            //小于数组1的最大值
            for (int j = find_way; j < m; j++) {
                //小于数组1下标为j的值
                if(nums2[i]<=nums1[j]){
                    for(int x=m-1;x>=j;x--){
                        nums1[x+1]=nums1[x];
                    }
                    nums1[j]=nums2[i];
                    m++;
                    find_way=j;
                    break;
                }
            }

        }
    }
}
