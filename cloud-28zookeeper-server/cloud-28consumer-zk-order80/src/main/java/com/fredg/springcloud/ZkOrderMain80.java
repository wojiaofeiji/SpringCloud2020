package com.fredg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther FredG.
 * @date on 2021/3/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ZkOrderMain80.class, args);
    }
}
