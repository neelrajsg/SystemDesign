package SolidPrinciples.DIP.GoodCode;

public class NotificationService {

    private NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void Notify(String msg){
       channel.send(msg);
    }

}
