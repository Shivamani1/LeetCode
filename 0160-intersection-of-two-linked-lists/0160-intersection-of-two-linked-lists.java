/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;
        int a=0,b=0;
        if(A==null||B==null)
            return null;
        while(A!=null){
            A=A.next;
            a++;
        }
        while(B!=null){
            B=B.next;
            b++;
        }
B=headB;
A=headA;

        if(b>a){
           while(b>a){
            B=B.next;
            b--;

        } }
        else {
             while(a>b){
            A=A.next;
            a--;
        }}
          while(b>0){
              if(A==B)
                  return A;
              A=A.next;
             B=B.next;
              b--;
          }
            return null;
        
        
    }
}