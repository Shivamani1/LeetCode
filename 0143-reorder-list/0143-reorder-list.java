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
    public void reorderList(ListNode head) {
        if(head.next==null)
            return;
     ListNode slow=head;
     ListNode fast=head;
        
        
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode head2=slow.next;
        slow.next=null;
        
        fast=head2.next;
        head2.next=null;
        while(fast!=null){
            slow=fast;
            fast=fast.next;
            slow.next=head2;
            head2=slow;
        }
    
        
// while(head2!=null){
//            System.out.print(head2.val+" ");
//             head2= head2.next;
            
//         }
      fast=head2.next;
        ListNode cur = head;
        
       while(head2!=null){
           slow=cur.next;
           fast=head2.next;
           cur.next=head2;
           head2.next=slow;
           cur=slow;
           head2=fast;
 
       }
        
        
      
        
        
        
       
    }
}