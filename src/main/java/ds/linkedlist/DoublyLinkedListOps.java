package ds.linkedlist;

public class DoublyLinkedListOps {
    DoublyLinkedListNode head, tail;

    public DoublyLinkedListOps() {

    }

    public void insert(int data) {
        DoublyLinkedListNode new_node = new DoublyLinkedListNode(data);
        if (head == null) {
            head = tail = new_node;
            return;
        }
        new_node.next = head;
        new_node.prev = null;
        head.prev = new_node;
        head = new_node;
    }

    public void deleteNode(int data) {
        DoublyLinkedListNode node = find(data);
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public DoublyLinkedListNode find(int data) {
        if (head == null) {
            return null;
        }
        DoublyLinkedListNode node = null;
        DoublyLinkedListNode temp = head;
        while (temp != null) {
            if (data == temp.data) {
                node = temp;
                return node;
            }
            temp=temp.next;
        }
        return node;
    }

    public void print() {
        if (head == null) {
            return;
        }
        DoublyLinkedListNode node = head;
        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.println("End");
    }

    public void printReverse() {
        if (tail == null) {
            return;
        }
        DoublyLinkedListNode node = tail;
        while (node != null) {
            System.out.print(node.data + "<--");
            node = node.prev;
        }
        System.out.println("Start");
    }

    public static void main(String[] args) {
        DoublyLinkedListOps ops = new DoublyLinkedListOps();
        ops.insert(3);
        ops.insert(2);
        ops.insert(7);
        ops.insert(4);
        ops.print();
        ops.printReverse();
        System.out.println("After Delete...");
        ops.deleteNode(7);
        ops.print();
        ops.printReverse();
    }
}
