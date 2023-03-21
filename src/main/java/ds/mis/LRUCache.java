package ds.mis;

import java.util.HashMap;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> map;
    int capicity, count;
    Node head, tail;

    public LRUCache(int capacity) {
        this.capicity = capacity;
        map = new HashMap();
        // create dummy nodes to point head and tail
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }

    void deleteNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    void addNodeToHead(Node node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addNodeToHead(node);
            return result;
        }
        return -1;
    }

    void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addNodeToHead(node);
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            if (count < capicity) {
                count = count + 1;
                addNodeToHead(node);
            } else {
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addNodeToHead(node);
            }
        }
    }

    public static void main(String[] args) {
        LRUCache l=new LRUCache(3);
        l.put(1,1);
        l.put(2,2);
        l.put(3,3);
        System.out.println(l.map);
    }
}
