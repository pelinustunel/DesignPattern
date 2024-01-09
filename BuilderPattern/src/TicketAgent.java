public class TicketAgent {

    private TicketBuilder ticketBuilder;

    public void setTicketBuilder(TicketBuilder ticketBuilder){
        this.ticketBuilder = ticketBuilder;
    }


    public void buildTicket(){
        ticketBuilder.buildPassengerName();
        ticketBuilder.buildDepartureLocation();
        ticketBuilder.buildDestination();
        ticketBuilder.buildDate();
        ticketBuilder.buildSeatNumber();
    }

    public Ticket getTicket(){
        return ticketBuilder.getTicket();
    }


}
