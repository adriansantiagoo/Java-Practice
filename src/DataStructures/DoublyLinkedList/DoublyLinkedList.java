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

    public void insertLast(int data){
        Node newNode = new Node(data);
        Node last = head;

        if (head == null){
            newNode.setPrev(null);
            head = newNode;
            return;
        }

        while(last.getNext() != null){
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setPrev(last);
        newNode.setNext(null);
    }

    public void insert(int value, int data){ // is the value of the prev node of the new node
        Node p = find(value);

        if (p == null){
            System.out.println("The data is not in the list.");
            return;
        }

        Node newNode = new Node(data);
        newNode.setPrev(p);
        newNode.setNext(p.getNext());
        p.setNext(newNode);
        if (newNode.getNext() != null){
            newNode.getNext().setPrev(newNode);
        }
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
        System.out.println("START");
    }

    public Node find(int data){
        Node node = head;
        while(node != null){
            if (node.getData() == data){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
}
