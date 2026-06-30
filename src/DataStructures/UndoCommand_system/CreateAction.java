package DataStructures.UndoCommand_system;

public class CreateAction {
    private Node head;

    // Method to add a new node at the end
    public void addAction(String action){
        Node newNode = new Node(action);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void undo(){

        // 1. Check if the list is empty FIRST
        if (head == null){
            System.out.println("The list is already empty!");
            return;
        }

        // 2. Check if there is only one action left SECOND
        if (head.getNext() == null){
            head = null;
            return;
        }

        // 3. Move until 'current' IS the second-to-last node
        Node current = head;
        while (current.getNext().getNext() == null){
            current = current.getNext();
        }

        // 4. Cut off the last node
        current.setNext(null);
    }
}
