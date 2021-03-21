package com.fredg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther FredG.
 * @date on 2021/3/21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulPayment8006 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8006.class, args);
    }
}
