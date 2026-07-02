package DataStructures.DoublyLinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        newNode.setPrev(null);
        if (head != null){
            head.setPrev(newNode);
        }
        head = newNode;
    }

    public void display(){
        Node newNode = head;
        Node last = null;
        while (newNode != null){
            System.out.print(newNode.getData() + " -> ");
            last = newNode;
            newNode = newNode.getNext();
        }
        System.out.println("END");

        System.out.println("Printing in reverse: ");
        while (last != null){
            System.out.print(last.getData() + " -> ");
            last = last.getPrev();
        }
        System.out.println("END");
    }
}
