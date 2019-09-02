package com.uncle.hello.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 杨戬
 * @className SpringCloudHelloProducerApplication
 * @email yangb@chaosource.com
 * @date 19-8-30 16:16
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudHelloProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHelloProducerApplication.class);
    }
}
