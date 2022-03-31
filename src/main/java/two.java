import strcut.ListNode;

import java.util.Stack;

public class two {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(5);
        l1.next=l2;

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l4.next=l5;
        addTwoNumbers(l1,l4);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        int jin=0;
        ListNode first = null;
        ListNode end=null;
        while(p!=null||q!=null||jin!=0 ){
            ListNode l3 =new ListNode();
            int l1_num=0;
            int l2_num=0;

            //若有栈为空
            if(p!=null){
                l1_num=p.val;
                p=p.next;
            }
            if(q!=null){
                l2_num=q.val;
                q=q.next;
            }
            l3.val=l2_num+l1_num+jin;
            jin=0;

            if(l3.val>=10){
                jin=1;
                l3.val=l3.val%10;
            }

            if(first==null){
                first=l3;
                end=l3;
            }
            else{
                end.next=l3;
                end=end.next;
            }
        }

        return first;
    }
}
