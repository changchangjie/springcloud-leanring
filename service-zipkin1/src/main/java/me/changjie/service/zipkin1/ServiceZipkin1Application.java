package me.changjie.service.zipkin1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceZipkin1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkin1Application.class, args);
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    public String hi(){
        return restTemplate.getForObject("http://localhost:8989/hi", String.class);
    }
}
