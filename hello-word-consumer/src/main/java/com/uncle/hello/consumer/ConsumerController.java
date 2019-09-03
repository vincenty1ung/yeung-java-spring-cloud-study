package com.uncle.hello.consumer;

import com.uncle.hello.api.HelloApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 杨戬
 * @className ConsumerController
 * @email uncle.yeung.bo@gmail.com
 * @date 19-9-2 17:25
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HelloApi helloApi;

    @GetMapping("/consumer/hello/world/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://localhost:1114/prodecer/hello/world/" + name, String.class);
    }

    @GetMapping("/consumer/feign/hello/world/{name}")
    public String helloWorldFeign(@PathVariable("name") String name) {
        return helloApi.helloWorld(name);
    }
}
