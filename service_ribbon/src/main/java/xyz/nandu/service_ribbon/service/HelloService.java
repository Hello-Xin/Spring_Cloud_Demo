package xyz.nandu.service_ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "HelloError")
    public String HelloService(String name){
        return restTemplate.getForObject("http://Eureka-Client/hello?name="+name,String.class);
    }

    public String HelloError(String name ){
        return "hello"+name+".sorry,Error";
    }
}
