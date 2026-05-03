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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        for(ListNode temp= head;temp!=null; temp=temp.next)size++;
        // if(n>size)return head;
        if(n==1 && size==1)return null;
        
        
        ListNode temp= head;
        n= size-n;
        if(n==0)return head.next;
        // ListNode prev=null;
        while(n>1){
            // prev= temp;
            temp= temp.next;
            n--;
        }
        if(temp.next!=null)
        temp.next= temp.next.next;
        else{
            temp.next= null;
        }

        return head;

    }
}