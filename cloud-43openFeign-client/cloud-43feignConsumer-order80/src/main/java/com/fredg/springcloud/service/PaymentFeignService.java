package com.fredg.springcloud.service;

import com.fredg.springcloud.entities.CommonResult;
import com.fredg.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author FredG
 * @create 2020-02-19 23:59
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    /**
     * 模拟feign超时
     *
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
