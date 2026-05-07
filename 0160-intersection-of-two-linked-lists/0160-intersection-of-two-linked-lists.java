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
        HashSet<ListNode> hash= new HashSet<>();

        ListNode tempA=headA;
        while(tempA!=null){
            hash.add(tempA);
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        while(tempB!=null){
            if(hash.contains(tempB)) return tempB;
            tempB=tempB.next;
        }
        return null;

    }
}