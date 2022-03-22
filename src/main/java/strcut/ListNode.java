package strcut;

public class ListNode {
      public int val;
      public ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

       public void setNext(ListNode next) {
        this.next = next;
       }
      }

