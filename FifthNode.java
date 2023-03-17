class Node
{
    int data;
    Node next;
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
class FifthNode {
    public int findFifthFromTail(Node head) {
        Node first = head;
        Node second = head;
        // move the second pointer to the fifth node from the head
        for (int i = 0; i < 4; i++) {
            if (second == null) {
                return -1; // list is too short
            }
            second = second.next;
        }
        // move both pointers until the second pointer reaches the end of the list
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        // at this point, the first pointer is pointing to the fifth element from the end
        return first.data;
    }
}

