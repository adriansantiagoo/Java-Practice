package DataStructures.MidListSurgery_system;

public class Main {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.insert(10, 1);
        myLinkedList.print();

        myLinkedList.insert(20, 2);
        myLinkedList.print();

        myLinkedList.insert(5, 1);
        myLinkedList.print();

        myLinkedList.insert(15, 3);
        myLinkedList.print();

        myLinkedList.delete(1);
        myLinkedList.print();

        myLinkedList.delete(2);
        myLinkedList.print();

        myLinkedList.delete(2);
        myLinkedList.print();
    }
}
