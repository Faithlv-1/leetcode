import strcut.ListNode;

public class one_four_two {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        //
        ListNode fast=head;
        ListNode slow=head;
        ListNode ptr=head;

        fast=fast.next.next;
        slow=slow.next;
        //找环
        while (fast!=null&&slow!=fast){
            fast=fast.next.next;
            slow=slow.next;
        }

        //退出找环
        //1.无环，fast==null
        if(fast==null)
            return null;
        //2.有环,slow==fast
        //找环点
        while (ptr!=slow){
            ptr=ptr.next;
            slow=slow.next;
        }
        return ptr;
    }
}
