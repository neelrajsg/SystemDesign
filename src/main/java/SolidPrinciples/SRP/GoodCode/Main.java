package SolidPrinciples.SRP.GoodCode;

public class Main {
    public static void main(String[] args) {
        Invoice iv=new Invoice(100);
                iv.generateInvoice();
        InvoiceRespository r=new InvoiceRespository();
                r.saveToDatabase();
        NotificationService n=new NotificationService();
                n.sendEmailNotification();

//        System.out.println("Invoice: "+ );
//        System.out.println("NotificationService:  "+n);
//        System.out.println("InvoiceRepository "+iv);
    }
}
