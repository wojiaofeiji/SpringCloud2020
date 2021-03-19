package com.fredg.springcloud.controller;

import com.fredg.springcloud.entities.CommonResult;
import com.fredg.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther FredG.
 * @date on 2021/3/19
 */
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://127.0.0.1:8001";

    /**
     * http://localhost/consumer/payment/create?serial=atguigu002
     * Spring restTemplate的使用 RestFul的远程http调用工具类
     * 此处的名称只是增加一个consumer模块名称.
     * 出现了Payment和CommonResult无法引入时， 请cleanCacheAndRestart
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    /**
     * http://localhost/consumer/payment/get/31
     *
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

}
