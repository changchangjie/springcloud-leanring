package me.changjie.service.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2019-03-14.
 */
@RestController
public class HelloController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne(name);
    }
}
