package me.changjie.service.feign;

import org.springframework.stereotype.Component;

/**
 * Created by ChangJie on 2019-03-14.
 */
@Component
public class HystrixService implements FeignService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
