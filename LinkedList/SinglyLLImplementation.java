package BeatLinkedList;
public class SinglyLLImplementation{

    public static class Node {
      int val;
      Node next;

      Node(int val){
        this.val = val;
      }
        
    }

    public static Node head = null;
    public static int size = 0;

    public static void insertFirst(int val){
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }


    public static void insertLast(int val){
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    public static int removeFirst(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        if(size == 1){
            int val = head.val;
            head = null;
            size--;
            return val;
        }
        int res = head.val;
        head = head.next;
        size--;
        return res;
    }

    public static int removeLast(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        if(size == 1){
            int val = head.val;
            head = null;
            return val;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int res = temp.next.val;
        temp.next = null;
        size--;
        return res;
    }

    public static void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +"->");
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
        removeFirst();
        System.out.println();
        display();
        removeLast();
        System.out.println();
        display();
        System.out.println(size);
    }
}
