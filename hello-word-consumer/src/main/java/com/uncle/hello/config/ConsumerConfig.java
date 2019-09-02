package com.uncle.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 杨戬
 * @className ConsumerConfig
 * @email yangb@chaosource.com
 * @date 19-9-2 17:29
 */
@Configuration
public class ConsumerConfig {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
