package xyz.nandu.service_feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.nandu.service_feign.service.HelloService;

@RestController
public class helloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name){
        return helloService.helloClient(name);
    }

}
