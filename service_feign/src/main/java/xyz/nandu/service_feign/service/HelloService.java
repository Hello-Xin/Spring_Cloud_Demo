package xyz.nandu.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "Eureka-Client")
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String helloClient(@RequestParam(value = "name")String name);
}
