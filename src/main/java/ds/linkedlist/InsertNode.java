package ds.linkedlist;

public class InsertNode {
    LinkedNode head;

    public LinkedNode insertNodeAtStarting(int data) {
        if (head == null) {
            head = new LinkedNode(data);
            return head;
        }
        LinkedNode new_data = new LinkedNode(data);
        new_data.next = head;
        head = new_data;
        return head;
    }

    public LinkedNode insertNodeAtEnd(int data) {
        if (head == null) {
            head = new LinkedNode(data);
            return head;
        }
        LinkedNode new_data = new LinkedNode(data);
        LinkedNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_data;
        return head;
    }

    public LinkedNode insertNodeAfterGivenNode(LinkedNode node, int data) {
        if (node == null) {
            return node;
        }
        LinkedNode new_data = new LinkedNode(data);
        LinkedNode temp = head;
        while (temp != null) {
            if (temp == node) {
                new_data.next = temp.next;
                temp.next = new_data;
                return head;
            }
            temp = temp.next;
        }
        return null;
    }
}
