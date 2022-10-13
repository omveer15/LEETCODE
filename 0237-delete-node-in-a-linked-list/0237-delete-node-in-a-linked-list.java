class Solution {
    public void deleteNode(ListNode node) {
      //  int value;
        if(node==null && node.next==null){
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}