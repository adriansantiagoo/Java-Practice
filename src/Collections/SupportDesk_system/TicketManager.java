package Collections.SupportDesk_system;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TicketManager {
    private Queue<Ticket> queue;
    private Stack<Ticket> stack;

    public TicketManager(){
        this.queue = new LinkedList<>();
        this.stack = new Stack<>();
    }

    public void addIncomingTicket(Ticket ticket){
        queue.add(ticket);
    }

    public Ticket processNextTicket(){
        if (queue.isEmpty()){
            System.out.println("The queue is empty.");
            return null;
        }
        Ticket t = queue.poll();

        t.setStatus(TicketStatus.DONE);
        stack.add(t);

        return t;
    }

    public void undoLastAction(){
        if (stack.isEmpty()){
            System.out.println("The stack is empty.");
            return;
        }
        Ticket lastTicket = stack.pop();

        lastTicket.setStatus(TicketStatus.TODO);
        queue.add(lastTicket);
    }
}
