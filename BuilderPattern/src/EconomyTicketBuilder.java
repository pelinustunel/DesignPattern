//CONCRETE BUILDER SINIFI (Somut olarak oluşturulan sınıf)

public class EconomyTicketBuilder implements TicketBuilder{
    private Ticket ticket;

    public EconomyTicketBuilder() {
        this.ticket = new Ticket();
    }
    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Pelin Üstünel");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("New York Havalanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("İstanbul Havalanı");
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


}