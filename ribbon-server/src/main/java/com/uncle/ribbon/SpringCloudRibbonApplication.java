package com.uncle.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 杨戬
 * @className SpringCloudHelloProducerApplication
 * @email yangb@chaosource.com
 * @date 19-8-30 16:16
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbonApplication.class);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
