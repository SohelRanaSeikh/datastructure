package ds.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        InsertNode node = new InsertNode();
        node.insertNodeAtStarting(1);
        node.insertNodeAtStarting(3);
        node.insertNodeAtStarting(5);
        node.insertNodeAtStarting(4);
        node.insertNodeAtEnd(6);
       // node.insertNodeAfterGivenNode(6);
        print(node.head);
    }

    private static void print(LinkedNode node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
