package SolidPrinciples.DIP.GoodCode;

public class Main {
    public static void main(String[] args) {

        NotificationService ns=new NotificationService(new EmailService());

        System.out.println();
        ns.Notify("Hello World!");

    }
}
