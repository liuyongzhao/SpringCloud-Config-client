package com.lkl.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Application {

    @Value("${foo}") 
    String foo ;

    @RequestMapping(value="/hi")
    public String hi(){
        return "Hello " + foo;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
