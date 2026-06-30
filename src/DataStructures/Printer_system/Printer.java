package DataStructures.Printer_system;

public class Printer {
    private Node head; // Points to the front (1st item)
    private Node tail; // Points to the back (Last item)

    public void enqueue(String documentName) {
        Node newNode = new Node(documentName);

        // Case 1: The queue is completely empty
        if (head == null) {
            head = newNode;
            tail = newNode; // If there's only one node, it's both head AND tail
            return;
        }

        // Case 2: The queue already has items (NO LOOP NEEDED!)
        tail.setNext(newNode); // Tell the current last node to point to the new node
        tail = newNode;        // Update our tail pointer to be the new node
    }

    public void dequeue(){
        // Case 1: The queue is empty
        if (head == null){
            System.out.println("The queue is empty!");
            return;
        }

        // Case 2: Only one node in the queue
        System.out.printf("Printing: %s.pdf \n", head.getDocumentName());
        if (tail == head){
            head = null;
            tail = null;
            return;
        }

        // Case 3: More than one node
        head = head.getNext(); // This grantee that the 2nd node become the 1st
    }

    public void displayQueue() {
        // Edge Case: What if the printer has no jobs?
        if (head == null) {
            System.out.println("The queue is completely empty.");
            return;
        }

        System.out.println("=== Current Printer Queue ===");

        // Start at the front of the line
        Node current = head;

        // Keep moving forward until current falls off the edge of the list
        while (current != null) {
            System.out.print("[" + current.getDocumentName() + "] -> ");

            // Move our temporary pointer to the next person in line
            current = current.getNext();
        }

        System.out.println("END");
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("The queue is empty!");
            return;
        }
        System.out.print("Queue Backward: ");
        displayRecursive(head);
        System.out.println("START");
    }

    private void displayRecursive(Node current) {
        if (current == null) {
            return;
        }
        displayRecursive(current.getNext());
        System.out.print("[" + current.getDocumentName() + "] <- ");
    }

    public void insertAtFront(String documentName) {
        Node newNode = new Node(documentName);

        // 1. Make the new node point to whatever is currently at the front
        newNode.setNext(head);

        // 2. Make the new node the official front of the line
        head = newNode;
    }
}
