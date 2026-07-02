package DataStructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(5);
        dll.insertFirst(7);
        dll.insertLast(99);
        dll.insert(7, 67);
        dll.display();
    }
}
