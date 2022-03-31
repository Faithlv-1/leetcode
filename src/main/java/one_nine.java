import strcut.ListNode;

import java.util.List;
import java.util.Stack;

public class one_nine {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        Stack<ListNode> st = new Stack<>();
//        int count=0;
//        ListNode p=head;
//        //将所有节点入栈
//
//        while (p!=null){
//            st.push(p);
//            p=p.next;
//            count++;
//        }
//        //判断链长度是否等于n
//        if(count==n)
//            return head.next;
//        count=0;
//        //将全部节点出栈，并记录第几个
//        while (!st.isEmpty()){
//            st.pop();
//            count++;
//            //判断是否为第n个
//            if(count==n){
//                st.peek().next=st.peek().next.next;
//            }
//        }
//
//        return head;

        //双指针，first指向删除的前一个，seco是两个相差n+1
        ListNode first=new ListNode(0,head);
        ListNode second=first;
        ListNode head2=first;
        for (int i = 0; i < n+1; i++) {
            second=second.next;
        }
        while(second!=null){
            first=first.next;
            second=second.next;
        }
        first.next=first.next.next;

        return head2.next;

    }
}
