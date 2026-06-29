package Design_payment_service;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("PrateekDebitCard",new Debitcard("1234","Prateek Narang"));
        ps.addPaymentMethod("PrateekCreditCard",new Creditcard("5678","Prateek Narang"));
        ps.addPaymentMethod("PrateekUPI",new UPI("prateek27"));
        ps.addPaymentMethod("PrateekWallet",new Wallet());

        //List of Paymet Methods
        List<PaymentMethod> methodsList = ps.getPaymentMethods();
        for(PaymentMethod pm : methodsList){
            System.out.println("Stored Payment Methods: " + pm);
        }
        System.out.println(" ");

        ps.makePayment("PrateekUPI");
        ps.makePayment("PrateekDebitCard");
        ps.makePayment("PrateekWallet");

    }
}
