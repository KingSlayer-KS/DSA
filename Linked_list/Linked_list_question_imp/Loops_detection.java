package Linked_list.Linked_list_question_imp;

class Loops_detection {
    
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode Loop_detect(ListNode head){
        if(head.next==null||head==null){
            return null;
        }
        ListNode slow=head,fast=head,prev=slow;

        while(fast != null && fast.next != null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return fast;
               
            }
        }
        prev.next=null;
        return slow;
    }
    
}
