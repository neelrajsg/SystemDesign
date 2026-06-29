package SolidPrinciples.DIP.BadCode;

public class NotificationService {

    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }
    public void  notifyByEmail(String msg){
        emailService.sendMail(msg);
    }
    public void  notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }

}
