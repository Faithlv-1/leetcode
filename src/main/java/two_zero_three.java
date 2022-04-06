import strcut.ListNode;

public class two_zero_three {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        ListNode first = new ListNode();
        first.next=head;
        head =first;
        ListNode end = first.next;
        //开始
        while (end!=null){
            if(end.val==val){
                end=end.next;
                first.next=first.next.next;
            }
            else {
                end=end.next;
                first=first.next;
            }
        }
        return head.next;
    }
}
