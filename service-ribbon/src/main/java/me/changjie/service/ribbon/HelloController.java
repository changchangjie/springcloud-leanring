package me.changjie.service.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ChangJie on 2019-03-14.
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name){
        return restTemplate.getForObject("http://service-provider/hi?name="+name, String.class);
    }

    public String hiError(String name, Throwable throwable) {
        throwable.printStackTrace();
        return "hi,"+name+",sorry,error!";
    }
}
