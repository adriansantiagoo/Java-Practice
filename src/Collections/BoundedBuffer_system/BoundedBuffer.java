package Collections.BoundedBuffer_system;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer <T> {
    private Queue<T> itemList = new LinkedList<>();
    private int maxCapacity;

    public BoundedBuffer(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public void deposit(T item){
        if (isFull()){
            throw new IllegalStateException("The buffer is full.");
        }
        itemList.add(item);
    }

    public T drain(){
        if (isEmpty()){
            throw new IllegalStateException("The buffer is empty.");
        }
        return itemList.poll();
    }

    public boolean isFull(){
        return size() == maxCapacity;
    }

    public boolean isEmpty(){
        return itemList.isEmpty();
    }

    public int size(){
        return itemList.size();
    }

    public static void main(String[] args) {
        // test case 1: String Pipeline (capacity: 2)
        System.out.println("Testing String Buffer");
        BoundedBuffer<String> logBuffer = new BoundedBuffer<>(2);

        logBuffer.deposit("LOG-001: User logged in");
        logBuffer.deposit("LOG-002: Payment processed");

        System.out.println("Buffer full? " + logBuffer.isFull());
        System.out.println("Drained: " + logBuffer.drain());
        System.out.println("Buffer size after drain: " + logBuffer.size());

        // this should trigger my new exception handling if the user try to overflow it
        try {
            logBuffer.deposit("LOG-003: Subscribed to newsletter"); // fits in slot 2
            logBuffer.deposit("LOG-004: Force Overflow");          // should throw exception
        }
        catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
        // TEST CASE 2: Integer Pipeline (Capacity: 3)
        System.out.println("\nTesting Integer Buffer");
        BoundedBuffer<Integer> transactionBuffer = new BoundedBuffer<>(3);

        transactionBuffer.deposit(1001);
        transactionBuffer.deposit(1002);
        transactionBuffer.deposit(1003);

        // cleaning the buffer
        while (!transactionBuffer.isEmpty()) {
            System.out.println("Processing TxID: " + transactionBuffer.drain());
        }

        // testing underflow exception
        try {
            transactionBuffer.drain(); // buffer is empty, should throw exception
        } catch (IllegalStateException e) {
            System.out.println("Caught expected underflow exception: " + e.getMessage());
        }
    }
}
