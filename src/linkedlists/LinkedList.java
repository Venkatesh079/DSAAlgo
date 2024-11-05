package linkedlists;

public class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;

    }

    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If inserting at the head (position 1)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;

        // Traverse the list until the node before the desired position
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // If the position is greater than the list length
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node by adjusting pointers
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void display() {
        Node current = head;
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
       }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insertAtBeginning(0);
        display();
        insertAtEnd(60);
        display();
        insertAtPosition(50,6);
        display();

    }
}
