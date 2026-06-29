package Design_payment_service;

public class Creditcard extends Card {

    public Creditcard(String cardNo,String username) {
        super(cardNo,username);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card");
    }

}
