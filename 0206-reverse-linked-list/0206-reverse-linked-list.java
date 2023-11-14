/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr1,ptr;
       
        if(head==null||head.next==null)
            return head;
         ptr=head.next;
        if(ptr.next==null){
            head.next=null;
            ptr.next=head;
            head=ptr;
            return head;
        }
        ptr1=ptr.next;
        head.next=null;
        while(ptr1.next!=null){
        ptr.next=head;
        head=ptr;
        ptr=ptr1;
        ptr1=ptr1.next;    
        }
        ptr.next=head;
        ptr1.next=ptr;
        head=ptr1;
        return head;
        
    }
}