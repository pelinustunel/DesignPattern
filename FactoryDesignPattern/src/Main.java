import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n" +
                "1.Banka Transferi ile \n" + "2.Dijital Cüzdan ile \n" +
                "3.Kredi Kartı ile \n" +
                "4.PayPal ile \n");
        int result = scanner.nextInt();

        switch (result) {
            case 1:
                Payment banktransfer = paymentFactory.createPaymen("BankTrans");
                banktransfer.processPayment();
                break;
            case 2:
                Payment digitalwallet = paymentFactory.createPaymen("DigitalWallet");
                digitalwallet.processPayment();
                break;
            case 3:
                Payment creditcard = paymentFactory.createPaymen("CreditCard");
                creditcard.processPayment();
                break;
            case 4:
                Payment paypal = paymentFactory.createPaymen("PayPal");
                paypal.processPayment();
                break;
        }

    }
}