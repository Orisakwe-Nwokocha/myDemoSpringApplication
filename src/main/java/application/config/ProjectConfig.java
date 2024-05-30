package application.config;

import application.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "application")
public class ProjectConfig {

    @Bean
    public HelloService helloService1() {
        return new HelloService();
    }

    @Bean
    @Primary
    public HelloService helloService2() {
        return new HelloService();
    }

}
