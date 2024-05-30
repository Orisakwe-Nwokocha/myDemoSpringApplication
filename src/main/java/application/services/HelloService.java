package application.services;

import org.springframework.stereotype.Service;

//@Service
public class HelloService {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
