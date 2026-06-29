package Design_payment_service;

public class Debitcard extends  Card{

    protected String cardNo;
    protected  String Username;

    public   Debitcard(String cardNo, String Username) {
       super(cardNo,Username);
    }
    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card");
    }

}
