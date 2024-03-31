/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap();
        Node Head=null;
        Node tempHead=head;
        while(tempHead!=null){
            map.put(tempHead,new Node(tempHead.val));
            tempHead=tempHead.next;
        }
        
        tempHead=head;
        //map.forEach((a,b)->System.out.println(a));
        while(tempHead!=null){
            if(Head==null)
                Head=map.get(tempHead);
            Node copy= map.get(tempHead);
            copy.next=tempHead.next!=null?map.get(tempHead.next):null; 
            copy.random=tempHead.random!=null?map.get(tempHead.random):null; 
            tempHead=tempHead.next;
        }
      
        return Head;
        
    }
}