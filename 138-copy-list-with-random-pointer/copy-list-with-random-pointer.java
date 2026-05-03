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
        HashMap<Node,Node> map= new HashMap<>();
        if(head==null)return null;

        Node newhead=new Node(head.val);
        Node cur1=head.next, cur2=newhead;
        map.put(head,newhead);
        
        while(cur1!=null){
            Node newnode=new Node(cur1.val);
            cur2.next=newnode;
            map.put(cur1,newnode);

            cur1=cur1.next;
            cur2=cur2.next;
        }
        cur1=head;
        cur2=newhead;
        while(cur1!=null){
            cur2.random=map.get(cur1.random);
            cur1=cur1.next;
            cur2=cur2.next;
        }
    return newhead;
    }
}