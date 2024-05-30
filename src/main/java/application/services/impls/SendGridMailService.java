package application.services.impls;

import application.services.HelloService;
import application.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendGridMailService implements MailService {
    private HelloService helloService;

    // constructor injection
    @Autowired
    public SendGridMailService(HelloService helloService) {
        System.out.println("creating hello service");
        this.helloService = helloService;
    }

//     setter injection
    @Autowired
    public void setHelloService(HelloService helloService) {
        System.out.println("setting hello service");
        this.helloService = helloService;
    }

    @Override
    public void sendMailTo(String email) {
        helloService.sayHello(email);
        System.out.println("Mail sent to " + email + " using SendGrid");
    }
}
