package SolidPrinciples.DIP.GoodCode;

public class SmsServce implements NotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("Sending SMS ...");
    }
}
