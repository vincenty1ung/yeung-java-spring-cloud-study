package com.uncle.ribbon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 杨戬
 * @className HelloWorldController
 * @email yangb@chaosource.com
 * @date 19-9-2 16:29
 */
@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        //localhost:1115
        //HELLO-WORD-CONSUMER 学习study
        return restTemplate.getForObject("http://HELLO-WORD-CONSUMER/consumer/hello/world/" + name, String.class);
    }
}