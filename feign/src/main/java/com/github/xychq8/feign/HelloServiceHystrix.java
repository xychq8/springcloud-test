package com.github.xychq8.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangxu on 2017/12/1.
 */
@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public String sayHi(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }

}
