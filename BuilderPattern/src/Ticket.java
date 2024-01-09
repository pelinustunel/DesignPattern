//PRODUCT (Ürün): Ticket Sınıfı
public class Ticket {
    private String passengerName;
    private String departureLocation;
    private String destination;
    private String date;
    private String seatNumber;


    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String toString(){
        return "\nPassenger Name: " + passengerName +
                "\nDeparture Location: "+ departureLocation +
                "\nDestination " + destination +
                "\nDate: " + date +
                "\nSeat Number: "+ seatNumber;
    }
}