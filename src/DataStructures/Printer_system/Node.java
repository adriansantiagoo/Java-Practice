package DataStructures.Printer_system;

public class Node {
    private String documentName;
    private Node next;

    public Node(String documentName){
        this.documentName = documentName;
        this.next = null;
    }

    public String getDocumentName() {
        return documentName;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
