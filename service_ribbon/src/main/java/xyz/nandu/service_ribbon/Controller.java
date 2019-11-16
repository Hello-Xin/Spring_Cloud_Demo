package xyz.nandu.service_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.nandu.service_ribbon.service.HelloService;

@RestController
public class Controller {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String Hello(@RequestParam String name ){
        return helloService.HelloService(name);
    }
}
