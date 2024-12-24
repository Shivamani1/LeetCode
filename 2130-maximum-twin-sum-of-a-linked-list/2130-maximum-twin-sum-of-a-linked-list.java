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
    public int pairSum(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode cur= head;
        int c=0;
        while(cur!=null){
            cur=cur.next;
            c++;
        }
        c=c/2;
        cur=head;
        while(cur!=null){
            c--;
            if(c<0)
            s.push(cur);
            cur=cur.next;
            
        }
        cur=head;
        int sum=0;
        int max=0;
        while(cur!=null&&!s.isEmpty()){
            sum=s.pop().val+cur.val;
            max=Math.max(max,sum);
            cur=cur.next;   
        }
        return max;
        
    }
}