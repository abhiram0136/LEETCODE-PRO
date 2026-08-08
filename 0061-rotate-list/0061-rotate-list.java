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
    public ListNode findNthNode(ListNode head,int k){
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            if(len==k) return temp;
            len++;
            temp=temp.next;
        }
        // temp.next=head;
        return temp;
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        if(k%len==0) return head;
        k=k%len;
        temp.next=head;
        ListNode newHead=findNthNode(head,len-k);
        head=newHead.next;
        newHead.next=null;
        return head;
    }
}