import strcut.ListNode;

import java.util.HashSet;
import java.util.Set;

public class one_four_one {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2,l1);
        ListNode l3 = new ListNode(3,l2);
        l1.next=l3;
        boolean b = hasCycle(l3);
        System.out.println(b);
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if(!set.add(head))
                return true;
            head=head.next;
        }
        return false;
    }
}
