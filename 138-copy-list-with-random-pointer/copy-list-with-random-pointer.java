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
        HashMap<Node, Node> nodeList = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            nodeList.put(temp, new Node(temp.val));
            temp = temp.next;
        }


        temp = head;


        while (temp != null) {

            nodeList.get(temp).next = nodeList.get(temp.next);
            nodeList.get(temp).random = nodeList.get(temp.random);
            temp = temp.next;
        }


        return nodeList.get(head);
    }
}