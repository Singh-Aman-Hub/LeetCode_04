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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3= new ListNode((l1.val+l2.val)%10);
        ListNode temp=l3;
        int rem=(l1.val+l2.val)/10;
        
        l1= l1.next;
        l2= l2.next;
        while(l1!=null && l2!=null){
            
            int val= (l1.val+l2.val+rem)%10;
            rem = (l1.val+l2.val+rem)/10;

            l3.next= new ListNode(val);
            l3= l3.next;
            l1= l1.next;
            l2= l2.next;

        }
        while(l1!=null){
            
            int val= (l1.val+rem)%10;
            rem = (l1.val+rem)/10;
            l3.next= new ListNode(val);
            l1= l1.next;
            l3=l3.next;
        }
        while(l2!=null){
            
            int val= (l2.val+rem)%10;
            rem = (l2.val+rem)/10;
            l3.next= new ListNode(val);
            l2= l2.next;
            l3=l3.next;
        }
        if(rem!=0){
            l3.next= new ListNode(rem);
       
        }
        return temp;
    }
}