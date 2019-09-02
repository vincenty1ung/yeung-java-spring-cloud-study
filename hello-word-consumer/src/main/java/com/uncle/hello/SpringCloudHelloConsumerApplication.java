package com.uncle.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 杨戬
 * @className SpringCloudHelloConsumerApplication
 * @email yangb@chaosource.com
 * @date 19-8-30 16:16
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudHelloConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHelloConsumerApplication.class);
    }
}
