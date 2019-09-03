package com.uncle.hello.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 杨戬
 * @className HelloApi
 * @email yangb@chaosource.com
 * @date 19-9-3 13:43
 */
//连接至hello-word-producer
@FeignClient("hello-word-producer")
public interface HelloApi {
    /**
     * 对外暴露借口
     *
     * @param name 名字
     * @return 字符串
     */
    @GetMapping("/prodecer/hello/world/{name}")
    String helloWorld(@PathVariable("name") String name);
}
