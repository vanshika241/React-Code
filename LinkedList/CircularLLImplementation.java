package BeatLinkedList;

public class CircularLLImplementation {

    public static class Node {
        int val;
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
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public static void insertLast(int val) {
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public static int removeFirst() {
        if (size == 0) return -1;
        int val = head.val;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
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
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
        size--;
        return val;
    }

    public static void display() {
        if (head == null) {
            System.out.print("END");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.val + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.print("HEAD");
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
