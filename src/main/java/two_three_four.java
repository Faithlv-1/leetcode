import strcut.ListNode;

import java.util.Stack;

public class two_three_four {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        Stack<ListNode> stack = new Stack<>();
        ListNode p=head;
        int count=0;
        while (p!=null){
            stack.push(p);
            p=p.next;
            count++;
        }

        for (int i=0;i<count/2;i++){
            if(stack.peek().val!=head.val)
                return false;
            else{
                head=head.next;
                stack.pop();
            }
        }
        return true;
    }
}
