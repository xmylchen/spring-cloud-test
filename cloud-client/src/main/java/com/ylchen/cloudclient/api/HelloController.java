package com.ylchen.cloudclient.api;

import com.ylchen.cloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    public HelloService helloService;
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
