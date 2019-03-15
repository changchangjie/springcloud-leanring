package me.changjie.service.zipkin2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceZipkin2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkin2Application.class, args);
    }


    @RequestMapping(value = "hi")
    public String hi(){
        return "i am zipkin2";
    }
}
