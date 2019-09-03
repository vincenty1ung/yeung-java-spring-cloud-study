package com.uncle.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 杨戬
 * @className SpringCloudEurekaApplication
 * @email uncle.yeung.bo@gmail.com
 * @date 19-8-30 16:16
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class);
    }
}
