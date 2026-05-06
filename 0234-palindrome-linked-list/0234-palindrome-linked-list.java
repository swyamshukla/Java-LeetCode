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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next==null) return true;
        while(fast!=null &&( fast.next!=null && fast.next.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp =null;
        ListNode prev =null;
        ListNode curr= slow.next;
        while(curr!=null ){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr = temp;
        }
        slow.next=prev;
        while(slow.next!=null){
            if(head.val!=slow.next.val) return false;
            slow=slow.next;
            head=head.next;
        }
        return true;

    }
}