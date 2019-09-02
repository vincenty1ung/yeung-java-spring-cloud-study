package com.uncle.hello.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 杨戬
 * @className ConsumerController
 * @email yangb@chaosource.com
 * @date 19-9-2 17:25
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/hello/world/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://localhost:1114/prodecer/hello/world/" + name, String.class);
    }
}
