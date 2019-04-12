package com.ylchen.cloudclient.api;

import com.ylchen.cloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-b/data")
public class ScApiController {
    @Autowired
    public HelloService helloService;
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
