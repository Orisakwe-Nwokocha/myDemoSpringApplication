package application.services.impls;

import application.services.MailService;
import org.springframework.stereotype.Component;

@Component
public class MailGunMailService implements MailService {
    @Override
    public void sendMailTo(String email) {
        System.out.println("Mail sent to " + email + " using MailGun");
    }
}
