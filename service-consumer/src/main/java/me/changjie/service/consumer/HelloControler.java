package me.changjie.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ChangJie on 2019-03-14.
 */
@RestController
public class HelloControler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "hi")
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-provider/hi?name="+name, String.class);
    }
}
