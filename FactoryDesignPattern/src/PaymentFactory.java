public class PaymentFactory {

   Payment createPaymen(String paymentType) {

       if(paymentType.equalsIgnoreCase("CreditCard")){
           return new CreditCardPayment();
       }
       else if(paymentType.equalsIgnoreCase("BankTrans")) {
           return new BankTransferPayment();
       }
       else if(paymentType.equalsIgnoreCase("PayPal")) {
           return new PayPalPayment();
       }
       else if(paymentType.equalsIgnoreCase("DigitalWallet")) {
           return new DigitalWalletPayment();
       }
        return null;
   }

}
