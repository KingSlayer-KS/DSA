package Linked_list.Linked_list_question_imp;

class Solution {
 /* Definition for singly-linked list.*/
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode nzxt= head;
        int size=0;
        
        while(nzxt != null){
            nzxt= nzxt.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int pos=size-n;
        ListNode previous=head ;
        int current_pos=1;
        while(current_pos!=pos){
            previous=previous.next;
            current_pos++;
        }
        previous.next=previous.next.next;
        return head;
        
        
        
    }
}