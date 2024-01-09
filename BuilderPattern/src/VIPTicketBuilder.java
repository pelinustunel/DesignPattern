public class VIPTicketBuilder implements TicketBuilder{

    private Ticket ticket;
    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Pelin Üstünel");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("İzmir Havalanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("New York Havalanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("20-01-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("1A");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }

    public VIPTicketBuilder() {
        this.ticket = new Ticket();
    }
}
