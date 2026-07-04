package Collections.SupportDesk_system;

public class Ticket {
    private String name;
    private TicketStatus status;

    public Ticket(String name){
        this.name = name;
        this.status = TicketStatus.TODO;
    }

    public String getName() {
        return name;
    }


    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }
}
