class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // Insert at Beginning
    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Search
    public boolean search(int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Delete at Start
    public void deleteAtStart() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete at End
    public void deleteAtEnd() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBegining(20);
        list.insertAtBegining(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Linked List:");
        list.display();

        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 50: " + list.search(50));

        list.deleteAtStart();
        System.out.println("\nAfter Delete at Start:");
        list.display();

        list.deleteAtEnd();
        System.out.println("\nAfter Delete at End:");
        list.display();
    }
}