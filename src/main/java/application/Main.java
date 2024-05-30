package application;

import application.config.ProjectConfig;
import application.services.HelloService;
import application.services.MailService;
import application.services.impls.SendGridMailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Beans in the context: " + Arrays.toString(context.getBeanDefinitionNames()));

//        HelloService helloService =  context.getBean(HelloService.class);
//        helloService.sayHello("Aramide");

        MailService mailService = context.getBean(MailService.class);

/*        // reflection:
        Class<? extends MailService> mailServiceClass = mailService.getClass();
        Method declaredMethod = mailServiceClass.getDeclaredMethods()[1];
        System.out.println(declaredMethod);
        declaredMethod.setAccessible(true);
        HelloService helloService = new HelloService();
        declaredMethod.invoke(mailService, helloService); */

        mailService.sendMailTo("aramide@gmail.com");

    }
}
