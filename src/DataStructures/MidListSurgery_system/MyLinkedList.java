package DataStructures.MidListSurgery_system;

public class MyLinkedList {
    private Node head;

    public void insert(int data, int n){
        Node newNode = new Node(data);

        if (n == 1){
            newNode.setNext(head);
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < (n-2); i++){
            if (current != null){
                current = current.getNext();
            }
        }

        if (current != null){
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public void delete(int n){
        if (head == null) return;

        if (n == 1){
            head = head.getNext();
            return;
        }

        Node current = head;
        for (int i = 0; i < n - 2; i++){
            if (current != null){
                current = current.getNext();
            }
        }

        if (current != null && current.getNext() != null){
            Node targetToDelete = current.getNext(); // Grab the node we want to delete

            current.setNext(targetToDelete.getNext()); // Bypass it! (current points to target's next)

            targetToDelete.setNext(null); // Safely isolate the deleted node
        }
    }

    public void print(){
        Node newNode = head;

        while (newNode != null){
            System.out.print(newNode.getData() + " ");
            newNode = newNode.getNext();
        }
        System.out.println();
    }
}
