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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next==null || k==0)return head; 

        int n=1;
        ListNode temp;
        for(temp= head; temp.next!=null;temp= temp.next,n++);
        ListNode tail= temp;
        k= k%n;
        System.out.println(temp.val+" "+n+"-"+k);
        if(n==k)return head;

        n=n-k;
         
        temp= head;
       
        while(n>1){
            temp= temp.next;
            n--;
        }
        if(temp.next==null)return head;

        tail.next= head;
        ListNode newHead= temp.next;
        temp.next=null;

        return newHead;
    }
}