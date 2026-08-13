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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null){
        ListNode kthnode=findKthNode(temp,k);
            if(kthnode==null){
                if(prev!=null){

                prev.next=temp;
                }
                break;
            }
        ListNode nextNode=kthnode.next;
        kthnode.next=null;
        reverse(temp);
        if(temp==head){
            head=kthnode;
        }
        else{
            prev.next=kthnode;

        }
        prev=temp;
        temp=nextNode;
        }
        return head;
        
    }
    private ListNode findKthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;

    }
    private ListNode reverse(ListNode temp){
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}