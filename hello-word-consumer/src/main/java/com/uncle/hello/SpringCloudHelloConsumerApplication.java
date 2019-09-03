package com.uncle.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 杨戬
 * @className SpringCloudHelloConsumerApplication
 * @email uncle.yeung.bo@gmail.com
 * @date 19-8-30 16:16
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudHelloConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHelloConsumerApplication.class);
    }
}
