package DataStructures.UndoCommand_system;

public class Node {
    private String action;
    private Node next;

    public Node(String action) {
        this.action = action;
        this.next = null;
    }


    public String getAction() {
        return action;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
