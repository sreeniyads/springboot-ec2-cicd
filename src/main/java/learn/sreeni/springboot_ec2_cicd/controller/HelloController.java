package learn.sreeni.springboot_ec2_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/home")
    public String home(){
        return "Hello from Spring Boot on EC2!";
    }
}
