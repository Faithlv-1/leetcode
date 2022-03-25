import strcut.ListNode;

import java.util.HashSet;
import java.util.Set;

public class one_six_zero {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> ln = new HashSet<>();
        while(headA!=null){
            ln.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(!ln.add(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
