package com.fredg.springcloud.controller;

import com.fredg.springcloud.loadBanlance.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @auther FredG.
 * @date on 2021/3/21
 */
@RestController
@Slf4j
public class MyLoadBalancerController {

    /**
     * 自定义负载均衡规则
     */
    @Resource
    private LoadBalancer myLoadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate noLoadBalancedRestTemplate;

    /**
     * 路由规则: 轮询
     * http://localhost/consumer/payment/payment/lb
     *
     * @return
     */
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0) {
            return null;
        }
        ServiceInstance serviceInstance = myLoadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return noLoadBalancedRestTemplate.getForObject(uri + "/payment/lb", String.class);
    }

}
