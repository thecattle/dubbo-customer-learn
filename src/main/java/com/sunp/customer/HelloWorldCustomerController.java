package com.sunp.customer;

import com.sunp.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunpeng
 * @time 2017/12/27 11:34
 * @description
 */
//@EnableAutoConfiguration
@RestController
public class HelloWorldCustomerController {
    @Autowired(required = false)
    HelloService helloService;
//    @RequestMapping(value = "/customer")
//    public String customer(){
//        return helloService.sayHello();
//    }

    @RequestMapping(value = "/customer")
    public String customer(){
        return "1";
    }
}
