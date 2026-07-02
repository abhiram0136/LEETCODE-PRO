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
    public ListNode lastNode(ListNode temp,int k){
        int count=1;
        while(temp!=null){
            if(count==k) return temp;
            count++;
            temp=temp.next;

        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int len=1;
        if(head==null || head.next==null ||k==0){
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k%=len;
        if(k==len){
            return head;
        }
        temp.next=head;
        ListNode last=lastNode(head,len-k);
        head=last.next;
        last.next=null;
        return head;

        
    }
}