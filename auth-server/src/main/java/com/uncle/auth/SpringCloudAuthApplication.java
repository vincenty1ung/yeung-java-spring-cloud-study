package com.uncle.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 杨戬
 * @className SpringCloudEurekaApplication
 * @email yangb@chaosource.com
 * @date 19-8-30 16:16
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAuthApplication.class);
    }
}
