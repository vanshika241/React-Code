package BeatLinkedList;

public class DoublyLLImplementation {

    public static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public static void insertFirst(int val) {
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void insertLast(int val) {
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static int removeFirst() {
        if (size == 0) return -1;
        int val = head.val;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    public static int removeLast() {
        if (size == 0) return -1;
        int val = tail.val;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "<->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        insertFirst(2);
        insertFirst(1);
        insertLast(3);
        insertLast(4);
        insertLast(5);
        display();
        System.out.println();
        removeFirst();
        display();
        System.out.println();
        removeLast();
        display();
        System.out.println();
        System.out.println(size);
    }
}
