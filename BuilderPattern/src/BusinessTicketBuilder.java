//CONCRETE BUILDER SINIFI (Somut olarak oluşturulan sınıf)
public class BusinessTicketBuilder implements TicketBuilder{

    private Ticket ticket;

    public BusinessTicketBuilder(){
        this.ticket = new Ticket();
    }
    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Pelin Üstünel");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("New York Havaalanı");
    }

    @Override
    public void buildDestination(){
        ticket.setDestination("İzmir Havalanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("10-09-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("Business 6D");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }


}