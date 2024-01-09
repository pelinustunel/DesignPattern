public class Main {
    public static void main(String[] args) {

        TicketAgent agent = new TicketAgent();

        TicketBuilder economyTicketBuilder = new EconomyTicketBuilder();
        TicketBuilder businessTicketBuilder = new BusinessTicketBuilder();
        TicketBuilder vipTicketBuilder = new VIPTicketBuilder();

        //Ekonomi Sınıfını ait biletler oluşturuluyor
        agent.setTicketBuilder(economyTicketBuilder);
        agent.buildTicket();
        Ticket economyTicket = agent.getTicket();
        System.out.println("Economy Ticket: " + economyTicket);

        //Business Sınıfını ait biletler oluşturuluyor
        agent.setTicketBuilder(businessTicketBuilder);
        agent.buildTicket();
        Ticket businessTicket = agent.getTicket();
        System.out.println("Business Ticket: " + businessTicket);

        //VIP Sınıfını ait biletler oluşturuluyor
        agent.setTicketBuilder(vipTicketBuilder);
        agent.buildTicket();
        Ticket vipTicket = agent.getTicket();
        System.out.println("VIP Ticket: " + vipTicket);


    }
}