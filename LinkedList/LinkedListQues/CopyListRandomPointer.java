/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return null;
       Node oldtemp = head;
       HashMap<Node,Node> mp = new HashMap<>();
       while(oldtemp != null){
          Node newNode = new Node(oldtemp.val);
          mp.put(oldtemp,newNode);
          oldtemp = oldtemp.next;
       }

       oldtemp = head;
       while(oldtemp != null){
          Node newNode = mp.get(oldtemp);
          newNode.next = mp.get(oldtemp.next);
          newNode.random = mp.get(oldtemp.random);
          oldtemp = oldtemp.next;
       }
       return mp.get(head);
    }
}
