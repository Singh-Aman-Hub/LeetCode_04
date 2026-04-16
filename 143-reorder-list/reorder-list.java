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
        ListNode slow= head;
        ListNode fast= head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        
        ListNode curr= slow.next;
        slow.next=null;
        ListNode prev= null;
        ListNode next= null;

        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        ListNode newHead= prev;
        curr= head;
        ListNode curr2= newHead;
        while(curr2!=null ){
            ListNode first= curr.next;
            ListNode second= curr2.next;

            curr.next=curr2;
            curr2.next=first;
            curr=first;
            curr2= second;

        }

        // return head;
    }
}