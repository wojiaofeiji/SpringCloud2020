package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 8001先从自身处理问题，设置自身调用超时时间的峰值,峰值内可以正常运行,  超过了需要有兜底的方法处理,做服务降级fallback
 * 然后80订单微服务,也可以更好的保护自己,自己也依样画葫芦进行客户端端降级保护
 * @author zzyy
 * @create 2020/3/7 16:01
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
