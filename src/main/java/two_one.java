import strcut.ListNode;

public class two_one {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.setNext(four);
        two.setNext(three);


        ListNode last = mergeTwoLists(one,two);
        System.out.println(last);

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //节点为空情况
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        //获取头指针
        ListNode top;
        ListNode last;
        if(list1.val<list2.val){
            top = list1;
            last =list1;
            list1=list1.next;
        }
        else {
            top = list2;
            last =list2;
            list2=list2.next;
        }
        while(list1!=null&&list2!=null){
            if(list1.val< list2.val){
                last.next=list1;
                last=last.next;
                list1=list1.next;
            }
            else {
                last.next=list2;
                last=last.next;
                list2=list2.next;
            }
        }

        if(list2==null){
            last.next =list1;
        }
        else
            last.next=list2;

        return top;
    }
}
