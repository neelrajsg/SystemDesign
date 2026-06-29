package Design_payment_service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PaymentService {

    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name,PaymentMethod pm){
        paymentMethods.put(name,pm);
    }
    public void makePayment(String name){
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay(); //Run Time Polymorphism
    }

    public List<PaymentMethod> getPaymentMethods(){
        return new ArrayList<>(paymentMethods.values());
    }

}
