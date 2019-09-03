package com.uncle.hello.producer.controller;

import com.uncle.hello.api.HelloApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨戬
 * @className HelloWorldController
 * @email yangb@chaosource.com
 * @date 19-9-2 16:29
 */
@RestController
public class ProdecerController implements HelloApi {
    @Value("${server.port}")
    private String port;

    @Override
    @GetMapping("/prodecer/hello/world/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return "你好世界，当前访问者：" + name + " 端口：" + port;
    }
}
