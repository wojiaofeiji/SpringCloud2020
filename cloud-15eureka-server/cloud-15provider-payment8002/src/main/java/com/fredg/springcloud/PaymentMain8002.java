package com.fredg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 搭建过程中出现了多次找不到主类， 并且使用idea-maven-build也没有起作用
 * 后来通过terminal mvn clean install命令才真正的生成！！！！
 *
 * 报错信息：org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://localhost:9411/api/v2/spans": connect timed out;
 * 依赖中依赖可zipkin, 但是没有配置zikpin的服务，所以出现报错
 * @auther FredG.
 * @date on 2021/3/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }

}
