public class DigitalWalletPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Dijital cüzdan ile ödemeniz gerçekleştirildi.");
    }
}
